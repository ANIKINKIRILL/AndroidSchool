package ru.gdgkazan.githubmvp.di;

import javax.inject.Singleton;

import dagger.Component;
import ru.gdgkazan.githubmvp.repository.KeyValueStorage;
import ru.gdgkazan.githubmvp.screen.auth.AuthActivity;
import ru.gdgkazan.githubmvp.screen.repositories.RepositoriesActivity;
import ru.gdgkazan.githubmvp.screen.walkthrough.WalkthroughActivity;

/**
 * @author Artur Vasilov, added {@link ActivityBuildersModule} by ANIKINKIRILL
 */
@Singleton
@Component(modules = {DataModule.class, ActivityBuildersModule.class})
public interface AppComponent {

    KeyValueStorage keyValueStorage();
}
