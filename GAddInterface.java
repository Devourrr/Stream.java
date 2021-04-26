package week6day1;

public interface GAddInterface<T, U, R> {
	R add(T num1, U num2);

}
/*
interface biFunction<T,U,R>
유형 매개 변수:
	T: 함수에 대한 첫번째 인수의 유형
	U: 함수에 대한 두번째 인수의 유형
	R: 함수 결과의 유형
	
	알려진 모든 하위 인터페이스:
		BinaryOperator<T>
	기능적 인터페이스:
		이것은 기능적 인터페이스이므로 람다식 또는 메서드 참조에 대한 할당 대상으로 사용할 수 있습니다.
		

apply
R apply( T t, U u)
이 함수를 주어진 인수에 적용
매개 변수: 
t - 첫번째 함수 인수
u - 두번재 함수 인수
보고: 함수 결과

andThen
기본값<V> BiFunction< T , U , V> andThen ( Function <? super R ,? extends V> after)
이 함수를 먼저 입력에 적용한 다음 그 after함수를 결과에 적용하는 구성된 함수를 반환합니다 . 두 함수의 평가에서 예외가 발생하면 구성된 함수의 호출자에게 전달됩니다.
유형 매개 변수 :
V- after함수 의 출력 유형 및 구성된 함수
매개 변수 :
after -이 기능 적용 후 적용 할 기능
보고:
이 함수를 먼저 적용한 다음 함수를 적용하는 after합성 함수
던졌습니다 :
NullPointerException -after가 null 인 경우 */
