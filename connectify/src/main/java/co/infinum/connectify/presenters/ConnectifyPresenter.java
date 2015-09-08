package co.infinum.connectify.presenters;

/**
 * Created by Željko Plesac on 06/01/15.
 *
 * Default ConnectionPresenter, which must be extended by our application BasePresenter
 */
public interface ConnectifyPresenter {

    /**
     * Activity or fragment should register for network updates on its onStart() method.
     */
    void registerForNetworkUpdates();

    /**
     * Activity or fragment should unregister for network updates on its onStop() method.
     */
    void unregisterFromNetworkUpdates();
}
