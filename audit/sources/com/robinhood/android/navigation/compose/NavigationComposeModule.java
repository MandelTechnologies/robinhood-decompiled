package com.robinhood.android.navigation.compose;

import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: NavigationComposeModule.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u0004\u001a<\u00128\u00126\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006j\u0007`\u000f¢\u0006\u0002\b\r¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e0\u0005H'¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/compose/NavigationComposeModule;", "", "<init>", "()V", "provideNavGraphBuilders", "", "Lkotlin/Function2;", "Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavHostController;", "Lkotlin/ParameterName;", "name", "navController", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/navigation/compose/NavGraphBuilderFn;", "lib-navigation-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class NavigationComposeModule {
    public static final int $stable = 0;

    @ProvidesNavGraph
    public abstract Set<Function2<NavGraphBuilder, NavHostController, Unit>> provideNavGraphBuilders();
}
