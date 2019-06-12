package ru.gdgkazan.githubmvp.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import ru.gdgkazan.githubmvp.screen.auth.AuthActivity;
import ru.gdgkazan.githubmvp.screen.repositories.RepositoriesActivity;
import ru.gdgkazan.githubmvp.screen.walkthrough.WalkthroughActivity;

@Module
public abstract class ActivityBuildersModule {

    @Singleton
    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();

    @Singleton
    @ContributesAndroidInjector
    abstract RepositoriesActivity contributeRepositoriesActivity();

    @Singleton
    @ContributesAndroidInjector
    abstract WalkthroughActivity contributeWalkthroughActivity();

}
