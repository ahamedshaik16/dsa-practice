package dsa.arrays;

public class ElevatorRequests_4020 {
    public int elevatorRequests(int n, int[] requests) {
        int totalSeconds = requests[0];
        for (int i = 1; i < requests.length; i++) {
            totalSeconds += Math.abs(requests[i] - requests[i-1]);
        }
        return totalSeconds;

    }
}
