package com.jagoteori.tourismapp.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.jagoteori.tourismapp.R
import com.jagoteori.tourismapp.di.Injection
import com.jagoteori.tourismapp.model.Tourism
import com.jagoteori.tourismapp.ui.ViewModelFactory
import com.jagoteori.tourismapp.ui.common.UiState
import com.jagoteori.tourismapp.ui.components.PopularPlaceCard
import com.jagoteori.tourismapp.ui.components.RecommendationCard
import com.jagoteori.tourismapp.ui.extension.noRippleClickable
import com.jagoteori.tourismapp.ui.theme.BlackColor500
import com.jagoteori.tourismapp.ui.theme.GreyColor300
import com.jagoteori.tourismapp.ui.theme.TourismAppTheme
import com.jagoteori.tourismapp.ui.theme.poppinsFamily

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel(
        factory = ViewModelFactory(Injection.provideRepository())
    ),
    navigateToDetail: (Int) -> Unit,
    navigateToAboutMe: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        HomeHeader(navigateToAboutMe = navigateToAboutMe)
        viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
            when (uiState) {
                is UiState.Loading -> {
                    viewModel.getAllRewards()
                }
                is UiState.Success -> {
                    HomeContent(
                        tourismList = uiState.data,
                        modifier = modifier,
                        navigateToDetail = navigateToDetail,
                    )
                }
                is UiState.Error -> {}
            }
        }


    }
}

@Composable
fun HomeContent(tourismList: List<Tourism>, modifier: Modifier, navigateToDetail: (Int) -> Unit) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(24.dp),
        contentPadding = PaddingValues(horizontal = 24.dp),
        content = {
            items(tourismList.size) { index ->
                PopularPlaceCard(
                    tourism = tourismList[index],
                    modifier = modifier,
                    onClickCard = { navigateToDetail(tourismList[index].id) }
                )
            }
        })

    Text(
        text = "Recommendation",
        fontSize = 18.sp,
        color = BlackColor500, fontFamily = poppinsFamily,
        fontWeight = FontWeight.SemiBold,
        modifier = modifier.padding(start = 24.dp, top = 30.dp, end = 24.dp, bottom = 16.dp)
    )
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(start = 24.dp, end = 24.dp, bottom = 30.dp),
        modifier = modifier
            .height(500.dp)
            .nestedScroll(
                object : NestedScrollConnection {
                    // Implement callbacks here
                }),
        content = {
            items(tourismList.size) { index ->
                RecommendationCard(
                    modifier = modifier,
                    tourism = tourismList[index],
                    onClickCard = { navigateToDetail(tourismList[index].id) }
                )
            }
        })
}

@Composable
fun HomeHeader(modifier: Modifier = Modifier, navigateToAboutMe: () -> Unit) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 30.dp, horizontal = 24.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Column {
            Text(
                text = "Howdy,\nMuh Ridhoi",
                lineHeight = 36.sp,
                color = BlackColor500, fontFamily = poppinsFamily,
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
            )
            Spacer(modifier = modifier.height(6.dp))
            Text(
                text = "Find your next adventure",
                fontSize = 16.sp,
                color = GreyColor300,
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.Light,
            )
        }
        Image(
            painter = painterResource(R.drawable.profile_solid_bg),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .noRippleClickable {
                    navigateToAboutMe()
                }
                .padding(top = 6.dp)
                .size(60.dp)
                .clip(shape = CircleShape),
            contentDescription = stringResource(id = R.string.profile_image_info),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    TourismAppTheme {
    }
}