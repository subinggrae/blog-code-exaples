// 외부에서는 이 클래스를 상속받을 수 없음(같은 패키지/파일 내에서만 가능)
sealed class NetworkResult

object Loading: NetworkResult()

data class Success(val data: String): NetworkResult()

data class Error(val message: String): NetworkResult()

fun handleResult(result: NetworkResult) {
    when (result) {
        is Loading -> println("로딩 중...")
        is Success -> println("데이터: ${result.data}")
        is Error -> println("오류: ${result.message}")
    }
}

handleResult(Loading)