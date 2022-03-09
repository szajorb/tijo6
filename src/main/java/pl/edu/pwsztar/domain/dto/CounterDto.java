package pl.edu.pwsztar.domain.dto;

public class CounterDto {

    private Long counter;

    public CounterDto(long counter) {
        this.counter = counter;
    }

    public Long getCounter() {
        return counter;
    }

    public void setCounter(Long counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "CounterDto{" +
                "counter=" + counter +
                '}';
    }

}