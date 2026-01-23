package com.robinhood.android.taxcenter;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.scarlet.ScarletContextWrapper;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BaseTaxComposeFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\r\u0010\u0011\u001a\u00020\u0007H\u0017¢\u0006\u0002\u0010\u0012J\u0011\u0010\u0013\u001a\u00020\u0007*\u00020\u0014H\u0017¢\u0006\u0002\u0010\u0015J\u0011\u0010\u0016\u001a\u00020\u0007*\u00020\u0017H\u0017¢\u0006\u0002\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH'¢\u0006\u0002\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0007H\u0017¢\u0006\u0002\u0010\u0012J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/taxcenter/BaseTaxComposeFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "()V", "onAttach", "", "context", "Landroid/content/Context;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "AppBarTitle", "(Landroidx/compose/runtime/Composer;I)V", "AppBarBackButton", "Lcom/robinhood/compose/bento/component/BentoAppBarScope;", "(Lcom/robinhood/compose/bento/component/BentoAppBarScope;Landroidx/compose/runtime/Composer;I)V", "AppBarActions", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V", "TaxCenterContent", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)V", "ComposeContent", "handle", "action", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public abstract class BaseTaxComposeFragment extends GenericComposeFragment implements SduiActionHandler<GenericAction> {
    public static final int $stable = GenericComposeFragment.$stable;
    private final boolean useDesignSystemToolbar = true;

    public void AppBarActions(Row5 row5, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(row5, "<this>");
        composer.startReplaceGroup(1918589231);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1918589231, i, -1, "com.robinhood.android.taxcenter.BaseTaxComposeFragment.AppBarActions (BaseTaxComposeFragment.kt:55)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    public void AppBarTitle(Composer composer, int i) {
        composer.startReplaceGroup(-1799950686);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1799950686, i, -1, "com.robinhood.android.taxcenter.BaseTaxComposeFragment.AppBarTitle (BaseTaxComposeFragment.kt:44)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    public abstract void TaxCenterContent(PaddingValues paddingValues, LazyListState lazyListState, Composer composer, int i);

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    public void AppBarBackButton(BentoAppBarScope bentoAppBarScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(bentoAppBarScope, "<this>");
        composer.startReplaceGroup(-2039650279);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2039650279, i, -1, "com.robinhood.android.taxcenter.BaseTaxComposeFragment.AppBarBackButton (BaseTaxComposeFragment.kt:48)");
        }
        composer.startReplaceGroup(5004770);
        boolean z = (((i & 112) ^ 48) > 32 && composer.changedInstance(this)) || (i & 48) == 32;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.taxcenter.BaseTaxComposeFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseTaxComposeFragment.AppBarBackButton$lambda$2$lambda$1(this.f$0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        bentoAppBarScope.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBarBackButton$lambda$2$lambda$1(BaseTaxComposeFragment baseTaxComposeFragment) {
        baseTaxComposeFragment.requireBaseActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, int i) {
        composer.startReplaceGroup(-911298113);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-911298113, i, -1, "com.robinhood.android.taxcenter.BaseTaxComposeFragment.ComposeContent (BaseTaxComposeFragment.kt:62)");
        }
        final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer, 0, 3);
        final TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composer, 0, 1);
        BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(getScarletManager()), null, ComposableLambda3.rememberComposableLambda(-755136435, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.taxcenter.BaseTaxComposeFragment.ComposeContent.1
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
                    ComposerKt.traceEventStart(-755136435, i2, -1, "com.robinhood.android.taxcenter.BaseTaxComposeFragment.ComposeContent.<anonymous> (BaseTaxComposeFragment.kt:67)");
                }
                final LazyListState lazyListState = lazyListStateRememberLazyListState;
                final TopBarScrollState topBarScrollState = topBarScrollStateRememberTopBarScrollState;
                final BaseTaxComposeFragment baseTaxComposeFragment = this;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(667012514, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.taxcenter.BaseTaxComposeFragment.ComposeContent.1.1
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
                            ComposerKt.traceEventStart(667012514, i3, -1, "com.robinhood.android.taxcenter.BaseTaxComposeFragment.ComposeContent.<anonymous>.<anonymous> (BaseTaxComposeFragment.kt:68)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i4).m21425getFg0d7_KjU();
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i4).m21371getBg0d7_KjU();
                        final LazyListState lazyListState2 = lazyListState;
                        final TopBarScrollState topBarScrollState2 = topBarScrollState;
                        final BaseTaxComposeFragment baseTaxComposeFragment2 = baseTaxComposeFragment;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1206239165, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.taxcenter.BaseTaxComposeFragment.ComposeContent.1.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i5) {
                                if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1206239165, i5, -1, "com.robinhood.android.taxcenter.BaseTaxComposeFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (BaseTaxComposeFragment.kt:72)");
                                }
                                Modifier modifierScrollableTopBarState = TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, lazyListState2, topBarScrollState2);
                                boolean showDivider = topBarScrollState2.getShowDivider();
                                final BaseTaxComposeFragment baseTaxComposeFragment3 = baseTaxComposeFragment2;
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-914054608, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.taxcenter.BaseTaxComposeFragment.ComposeContent.1.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i6) {
                                        if ((i6 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-914054608, i6, -1, "com.robinhood.android.taxcenter.BaseTaxComposeFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseTaxComposeFragment.kt:77)");
                                        }
                                        baseTaxComposeFragment3.AppBarTitle(composer5, GenericComposeFragment.$stable);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54);
                                final BaseTaxComposeFragment baseTaxComposeFragment4 = baseTaxComposeFragment2;
                                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(-978134948, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.taxcenter.BaseTaxComposeFragment.ComposeContent.1.1.1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer5, Integer num) {
                                        invoke(bentoAppBarScope, composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer5, int i6) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i6 & 6) == 0) {
                                            i6 |= (i6 & 8) == 0 ? composer5.changed(BentoAppBar) : composer5.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i6 & 19) == 18 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-978134948, i6, -1, "com.robinhood.android.taxcenter.BaseTaxComposeFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseTaxComposeFragment.kt:78)");
                                        }
                                        baseTaxComposeFragment4.AppBarBackButton(BentoAppBar, composer5, (i6 & 14) | BentoAppBarScope.$stable | (GenericComposeFragment.$stable << 3));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54);
                                final BaseTaxComposeFragment baseTaxComposeFragment5 = baseTaxComposeFragment2;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda2, modifierScrollableTopBarState, composableLambdaRememberComposableLambda3, ComposableLambda3.rememberComposableLambda(108784859, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.taxcenter.BaseTaxComposeFragment.ComposeContent.1.1.1.3
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer5, Integer num) {
                                        invoke(row5, composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Row5 BentoAppBar, Composer composer5, int i6) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i6 & 6) == 0) {
                                            i6 |= composer5.changed(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i6 & 19) == 18 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(108784859, i6, -1, "com.robinhood.android.taxcenter.BaseTaxComposeFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseTaxComposeFragment.kt:79)");
                                        }
                                        baseTaxComposeFragment5.AppBarActions(BentoAppBar, composer5, (i6 & 14) | (GenericComposeFragment.$stable << 3));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), null, false, showDivider, null, null, 0L, null, composer4, 3462, 0, 1968);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        final BaseTaxComposeFragment baseTaxComposeFragment3 = baseTaxComposeFragment;
                        final LazyListState lazyListState3 = lazyListState;
                        ScaffoldKt.m5625Scaffold27mzLpw(null, null, composableLambdaRememberComposableLambda, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, ComposableLambda3.rememberComposableLambda(-1500241372, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.taxcenter.BaseTaxComposeFragment.ComposeContent.1.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                invoke(paddingValues, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(final PaddingValues paddingValues, Composer composer4, int i5) {
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i5 & 6) == 0) {
                                    i5 |= composer4.changed(paddingValues) ? 4 : 2;
                                }
                                if ((i5 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1500241372, i5, -1, "com.robinhood.android.taxcenter.BaseTaxComposeFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (BaseTaxComposeFragment.kt:84)");
                                }
                                final BaseTaxComposeFragment baseTaxComposeFragment4 = baseTaxComposeFragment3;
                                final LazyListState lazyListState4 = lazyListState3;
                                SduiActionHandler3.ProvideActionHandler(baseTaxComposeFragment4, ComposableLambda3.rememberComposableLambda(475922275, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.taxcenter.BaseTaxComposeFragment.ComposeContent.1.1.2.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i6) {
                                        if ((i6 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(475922275, i6, -1, "com.robinhood.android.taxcenter.BaseTaxComposeFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseTaxComposeFragment.kt:85)");
                                        }
                                        baseTaxComposeFragment4.TaxCenterContent(paddingValues, lazyListState4, composer5, GenericComposeFragment.$stable << 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), composer4, GenericComposeFragment.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 384, 12582912, 32763);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, 384, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo15941handle(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.Deeplink) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
            return true;
        }
        if (action instanceof GenericAction.Dismiss) {
            requireBaseActivity().onBackPressed();
            return true;
        }
        if (action instanceof GenericAction.InfoAlert) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
