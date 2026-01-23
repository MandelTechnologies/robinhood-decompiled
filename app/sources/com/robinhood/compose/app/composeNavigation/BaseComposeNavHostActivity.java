package com.robinhood.compose.app.composeNavigation;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.view.compose.ComponentActivity6;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.compose.ProvidesNavGraph;
import com.robinhood.android.plt.contract.PltManager2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.scarlet.ScarletManager2;
import io.reactivex.Observable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BaseComposeNavHostActivity.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0015\u001a\u00020\f2@\u0010\u0016\u001a<\u00128\u00126\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006j\u0007`\u000f¢\u0006\u0002\b\r¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e0\u0017H'¢\u0006\u0002\u0010\u0018J\u0012\u0010\u0019\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014R^\u0010\u0004\u001a<\u00128\u00126\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006j\u0007`\u000f¢\u0006\u0002\b\r¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e0\u00058\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/compose/app/composeNavigation/BaseComposeNavHostActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "navGraphs", "", "Lkotlin/Function2;", "Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavHostController;", "Lkotlin/ParameterName;", "name", "navController", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/navigation/compose/NavGraphBuilderFn;", "getNavGraphs$annotations", "getNavGraphs", "()Ljava/util/Set;", "setNavGraphs", "(Ljava/util/Set;)V", "NavHostComposeContent", "navGraphsBuilders", "Lkotlinx/collections/immutable/ImmutableSet;", "(Lkotlinx/collections/immutable/ImmutableSet;Landroidx/compose/runtime/Composer;I)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "lib-compose-app_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public abstract class BaseComposeNavHostActivity extends BaseActivity {
    public static final int $stable = 8;
    public Set<Function2<NavGraphBuilder, NavHostController, Unit>> navGraphs;

    @ProvidesNavGraph
    public static /* synthetic */ void getNavGraphs$annotations() {
    }

    public abstract void NavHostComposeContent(ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> immutableSet, Composer composer, int i);

    public final Set<Function2<NavGraphBuilder, NavHostController, Unit>> getNavGraphs() {
        Set<Function2<NavGraphBuilder, NavHostController, Unit>> set = this.navGraphs;
        if (set != null) {
            return set;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navGraphs");
        return null;
    }

    public final void setNavGraphs(Set<Function2<NavGraphBuilder, NavHostController, Unit>> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.navGraphs = set;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentActivity6.setContent$default(this, null, ComposableLambda3.composableLambdaInstance(666109422, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.app.composeNavigation.BaseComposeNavHostActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(666109422, i, -1, "com.robinhood.compose.app.composeNavigation.BaseComposeNavHostActivity.onCreate.<anonymous> (BaseComposeNavHostActivity.kt:34)");
                }
                ProvidedValue[] providedValueArr = {LocalNavigator.getLocalNavigator().provides(BaseComposeNavHostActivity.this.getNavigator()), PltManager2.getLocalPltManager().provides(BaseComposeNavHostActivity.this.getPltManager())};
                final BaseComposeNavHostActivity baseComposeNavHostActivity = BaseComposeNavHostActivity.this;
                CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambda3.rememberComposableLambda(1693940014, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.app.composeNavigation.BaseComposeNavHostActivity.onCreate.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1693940014, i2, -1, "com.robinhood.compose.app.composeNavigation.BaseComposeNavHostActivity.onCreate.<anonymous>.<anonymous> (BaseComposeNavHostActivity.kt:38)");
                        }
                        Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(baseComposeNavHostActivity));
                        final BaseComposeNavHostActivity baseComposeNavHostActivity2 = baseComposeNavHostActivity;
                        BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-478744004, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.app.composeNavigation.BaseComposeNavHostActivity.onCreate.1.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-478744004, i3, -1, "com.robinhood.compose.app.composeNavigation.BaseComposeNavHostActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (BaseComposeNavHostActivity.kt:39)");
                                }
                                BaseComposeNavHostActivity baseComposeNavHostActivity3 = baseComposeNavHostActivity2;
                                baseComposeNavHostActivity3.NavHostComposeContent(extensions2.toImmutableSet(baseComposeNavHostActivity3.getNavGraphs()), composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 1, null);
    }
}
