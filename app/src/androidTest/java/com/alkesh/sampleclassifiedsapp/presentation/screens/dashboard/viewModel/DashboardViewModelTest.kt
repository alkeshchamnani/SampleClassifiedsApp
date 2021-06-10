package com.alkesh.sampleclassifiedsapp.presentation.screens.dashboard.viewModel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.alkesh.sampleclassifiedsapp.common.models.dto.AdvertisementModel
import com.alkesh.sampleclassifiedsapp.common.models.response.GetAdvertisementApiResponse
import com.alkesh.sampleclassifiedsapp.common.repository.AdvertisementRepository
import junit.framework.TestCase
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito

@RunWith(AndroidJUnit4::class)
class DashboardViewModelTest : TestCase() {
    @get:Rule
    val rule = InstantTaskExecutorRule()

    private val repo = Mockito.mock(AdvertisementRepository::class.java)

    private var viewModel = DashboardViewModel(repo)

    public override fun setUp() {
        super.setUp()
    }

    @Test
    fun testListSize() {
        runBlocking {
            val listAdvertisements = ArrayList<AdvertisementModel>()
            val advertisement1 = AdvertisementModel().apply {
                name = "Notebook"
                price = "AED 5"
                date = "2019-02-24 04:04:17.566515"
                uid = "4878bf592579410fba52941d00b62f94"
                imageUrls = ArrayList<String>().apply {
                    add(
                        "https://demo-app-photos-45687895456123.s3.amazonaws.com/9355183956e3445e89735d877b798689?AWSAccessKeyId=ASIASV3YI6A4XPZA4XDS&Signature=x%2BwCsgTd7Tiy5aMmEu2wB2YnO%2Bo%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEOj%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJIMEYCIQC74r34Bc8LiJ5xJ0sFQz%2F3CJ6eYEv79mqczXiCvew5bQIhAKCaO%2FKJtN17r83IK5NxuATsgYGSIlCinYbJpIXNUozxKp0CCKH%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEQAhoMMTg0Mzk4OTY2ODQxIgzt0ZsKs3jbj%2FSuYnUq8QGH92Xnxs0E4SYFqWNuOXBfAcYBLLYem%2FOO%2FkrHeVOGMyGZMjD31OTCtAYFdQFRCKzGKUpeIyqhw4ahsd3PgutDXnj4bbfi1CmaKSMogJx5Vy%2FbpQ6vpoCcTDeH2MQCzyJqJw7wLooIm9FB5YHT6iquVhqVrDvJUhsiInjZs8nO%2Fh5fy6AMCU%2FQnL%2BuMmZDmMYZqvOOKD%2BNUyudjpAAkLO4dFpwqsTSx%2B%2FSDrgN%2BqLc6Wock3BbWwdacUXs%2FtTDh%2BQ3rMJTnQOKajoFf%2F4QK4Zw%2B561a0xQCjIhpPPjHPALYNGcMvbSbysrQ6uN38mvfYxtMNX%2BhoYGOpkBDo1bB%2FUxOT8BFVtRDxrGlpd8rdfyyrmhFWkwiOztG4z30dL9vuPIU6bhFmHZAGioQ%2BDE3xBFGw4hMnH0BgJP%2FKB%2Fyvd0t6VXyZ%2B4%2FjlbqOF3HRu8eRC09CuECfcHQJI5HaJenGoUFw2CFsrcfHwRrAsa7F6unhqsoovhiWGfyvZYGH89sXOhxfjlz9FCS0HqEo2WTX3O3GrY&Expires=1623313768"
                    )
                }
                imageUrlsThumbnails = ArrayList<String>().apply {
                    add(
                        "https://demo-app-photos-45687895456123.s3.amazonaws.com/9355183956e3445e89735d877b798689-thumbnail?AWSAccessKeyId=ASIASV3YI6A4XPZA4XDS&Signature=eg5vjVrZaVM7WwBMlisthObjs2k%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEOj%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJIMEYCIQC74r34Bc8LiJ5xJ0sFQz%2F3CJ6eYEv79mqczXiCvew5bQIhAKCaO%2FKJtN17r83IK5NxuATsgYGSIlCinYbJpIXNUozxKp0CCKH%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEQAhoMMTg0Mzk4OTY2ODQxIgzt0ZsKs3jbj%2FSuYnUq8QGH92Xnxs0E4SYFqWNuOXBfAcYBLLYem%2FOO%2FkrHeVOGMyGZMjD31OTCtAYFdQFRCKzGKUpeIyqhw4ahsd3PgutDXnj4bbfi1CmaKSMogJx5Vy%2FbpQ6vpoCcTDeH2MQCzyJqJw7wLooIm9FB5YHT6iquVhqVrDvJUhsiInjZs8nO%2Fh5fy6AMCU%2FQnL%2BuMmZDmMYZqvOOKD%2BNUyudjpAAkLO4dFpwqsTSx%2B%2FSDrgN%2BqLc6Wock3BbWwdacUXs%2FtTDh%2BQ3rMJTnQOKajoFf%2F4QK4Zw%2B561a0xQCjIhpPPjHPALYNGcMvbSbysrQ6uN38mvfYxtMNX%2BhoYGOpkBDo1bB%2FUxOT8BFVtRDxrGlpd8rdfyyrmhFWkwiOztG4z30dL9vuPIU6bhFmHZAGioQ%2BDE3xBFGw4hMnH0BgJP%2FKB%2Fyvd0t6VXyZ%2B4%2FjlbqOF3HRu8eRC09CuECfcHQJI5HaJenGoUFw2CFsrcfHwRrAsa7F6unhqsoovhiWGfyvZYGH89sXOhxfjlz9FCS0HqEo2WTX3O3GrY&Expires=1623313768"
                    )
                }
            }
            val advertisement2 = AdvertisementModel().apply {
                name = "Glasses"
                price = "AED 500"
                date = "2019-02-23 07:56:26.686128"
                uid = "4878bf592579410fba52941d00b62f94"
                imageUrls = ArrayList<String>().apply {
                    add(
                        "https://demo-app-photos-45687895456123.s3.amazonaws.com/9355183956e3445e89735d877b798689?AWSAccessKeyId=ASIASV3YI6A4XPZA4XDS&Signature=x%2BwCsgTd7Tiy5aMmEu2wB2YnO%2Bo%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEOj%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJIMEYCIQC74r34Bc8LiJ5xJ0sFQz%2F3CJ6eYEv79mqczXiCvew5bQIhAKCaO%2FKJtN17r83IK5NxuATsgYGSIlCinYbJpIXNUozxKp0CCKH%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEQAhoMMTg0Mzk4OTY2ODQxIgzt0ZsKs3jbj%2FSuYnUq8QGH92Xnxs0E4SYFqWNuOXBfAcYBLLYem%2FOO%2FkrHeVOGMyGZMjD31OTCtAYFdQFRCKzGKUpeIyqhw4ahsd3PgutDXnj4bbfi1CmaKSMogJx5Vy%2FbpQ6vpoCcTDeH2MQCzyJqJw7wLooIm9FB5YHT6iquVhqVrDvJUhsiInjZs8nO%2Fh5fy6AMCU%2FQnL%2BuMmZDmMYZqvOOKD%2BNUyudjpAAkLO4dFpwqsTSx%2B%2FSDrgN%2BqLc6Wock3BbWwdacUXs%2FtTDh%2BQ3rMJTnQOKajoFf%2F4QK4Zw%2B561a0xQCjIhpPPjHPALYNGcMvbSbysrQ6uN38mvfYxtMNX%2BhoYGOpkBDo1bB%2FUxOT8BFVtRDxrGlpd8rdfyyrmhFWkwiOztG4z30dL9vuPIU6bhFmHZAGioQ%2BDE3xBFGw4hMnH0BgJP%2FKB%2Fyvd0t6VXyZ%2B4%2FjlbqOF3HRu8eRC09CuECfcHQJI5HaJenGoUFw2CFsrcfHwRrAsa7F6unhqsoovhiWGfyvZYGH89sXOhxfjlz9FCS0HqEo2WTX3O3GrY&Expires=1623313768"
                    )
                }
                imageUrlsThumbnails = ArrayList<String>().apply {
                    add(
                        "https://demo-app-photos-45687895456123.s3.amazonaws.com/9355183956e3445e89735d877b798689-thumbnail?AWSAccessKeyId=ASIASV3YI6A4XPZA4XDS&Signature=eg5vjVrZaVM7WwBMlisthObjs2k%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEOj%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJIMEYCIQC74r34Bc8LiJ5xJ0sFQz%2F3CJ6eYEv79mqczXiCvew5bQIhAKCaO%2FKJtN17r83IK5NxuATsgYGSIlCinYbJpIXNUozxKp0CCKH%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEQAhoMMTg0Mzk4OTY2ODQxIgzt0ZsKs3jbj%2FSuYnUq8QGH92Xnxs0E4SYFqWNuOXBfAcYBLLYem%2FOO%2FkrHeVOGMyGZMjD31OTCtAYFdQFRCKzGKUpeIyqhw4ahsd3PgutDXnj4bbfi1CmaKSMogJx5Vy%2FbpQ6vpoCcTDeH2MQCzyJqJw7wLooIm9FB5YHT6iquVhqVrDvJUhsiInjZs8nO%2Fh5fy6AMCU%2FQnL%2BuMmZDmMYZqvOOKD%2BNUyudjpAAkLO4dFpwqsTSx%2B%2FSDrgN%2BqLc6Wock3BbWwdacUXs%2FtTDh%2BQ3rMJTnQOKajoFf%2F4QK4Zw%2B561a0xQCjIhpPPjHPALYNGcMvbSbysrQ6uN38mvfYxtMNX%2BhoYGOpkBDo1bB%2FUxOT8BFVtRDxrGlpd8rdfyyrmhFWkwiOztG4z30dL9vuPIU6bhFmHZAGioQ%2BDE3xBFGw4hMnH0BgJP%2FKB%2Fyvd0t6VXyZ%2B4%2FjlbqOF3HRu8eRC09CuECfcHQJI5HaJenGoUFw2CFsrcfHwRrAsa7F6unhqsoovhiWGfyvZYGH89sXOhxfjlz9FCS0HqEo2WTX3O3GrY&Expires=1623313768"
                    )
                }
            }
            listAdvertisements.add(advertisement1)
            listAdvertisements.add(advertisement2)
            val model = GetAdvertisementApiResponse()
            model.successful = true
            model.result = listAdvertisements
            Mockito.`when`(repo.getAdvertisements()).thenReturn(model)
            viewModel.getListAdvertisements()
            assert(viewModel.listAdvertisements.value?.size == 2)
        }
    }

    @Test
    fun testFailureCase() {
        runBlocking {
            val listAdvertisements = ArrayList<AdvertisementModel>()
            val model = GetAdvertisementApiResponse()
            model.successful = false
            model.message = "No Internet Connection"
            model.result = listAdvertisements
            Mockito.`when`(repo.getAdvertisements()).thenReturn(model)
            viewModel.getListAdvertisements()
            assert(viewModel.listAdvertisements.value == null || viewModel.listAdvertisements.value?.size == 0)
        }
    }

}