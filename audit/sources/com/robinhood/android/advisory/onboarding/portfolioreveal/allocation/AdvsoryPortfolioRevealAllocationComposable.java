package com.robinhood.android.advisory.onboarding.portfolioreveal.allocation;

import advisory.portfolio_reveal.proto.p007v1.GetPortfolioRevealResponseDto;
import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealAssetClassBreakdownDto;
import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealAssetClassOverviewDto;
import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealAssetClassRowDto;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.advisory.onboarding.portfolioreveal.PortfolioRevealUtils;
import com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvsoryPortfolioRevealAllocationComposable;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: AdvsoryPortfolioRevealAllocationComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001aA\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"AllocationHeroImageHeight", "Landroidx/compose/ui/unit/Dp;", "F", "AdvisoryPortfolioRevealAllocationComposable", "", "screenTitleOverride", "", "portfolioReveal", "Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;", "source", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "callbacks", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/PortfolioRevealAllocationCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/PortfolioRevealAllocationCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-advisory-onboarding_externalDebug", "footerDividerVisible", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvsoryPortfolioRevealAllocationComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvsoryPortfolioRevealAllocationComposable {
    private static final float AllocationHeroImageHeight = C2002Dp.m7995constructorimpl(250);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryPortfolioRevealAllocationComposable$lambda$3(String str, GetPortfolioRevealResponseDto getPortfolioRevealResponseDto, String str2, BrokerageAccountType brokerageAccountType, AdvsoryPortfolioRevealAllocationComposable7 advsoryPortfolioRevealAllocationComposable7, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AdvisoryPortfolioRevealAllocationComposable(str, getPortfolioRevealResponseDto, str2, brokerageAccountType, advsoryPortfolioRevealAllocationComposable7, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisoryPortfolioRevealAllocationComposable(final String str, final GetPortfolioRevealResponseDto portfolioReveal, final String source, final BrokerageAccountType brokerageAccountType, final AdvsoryPortfolioRevealAllocationComposable7 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        PortfolioRevealAssetClassOverviewDto asset_class_overview;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(portfolioReveal, "portfolioReveal");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1256768868);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(portfolioReveal) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(source) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(brokerageAccountType.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1256768868, i3, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvisoryPortfolioRevealAllocationComposable (AdvsoryPortfolioRevealAllocationComposable.kt:69)");
                }
                asset_class_overview = portfolioReveal.getAsset_class_overview();
                if (asset_class_overview != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvsoryPortfolioRevealAllocationComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(scrollStateRememberScrollState.getCanScrollForward());
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Screen screen = new Screen(Screen.Name.ADVISORY_PORTFOLIO_REVEAL_BREAKDOWN, null, asset_class_overview.getScreen_identifier(), null, 10, null);
                int i5 = i3;
                Context context = new Context(0, 0, 0, null, null, null, null, null, 0, null, source, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(brokerageAccountType), null, null, null, false, false, null, null, null, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -257, -1, -1, 16383, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU();
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(758530400, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvsoryPortfolioRevealAllocationComposableKt.AdvisoryPortfolioRevealAllocationComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(758530400, i7, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvisoryPortfolioRevealAllocationComposable.<anonymous> (AdvsoryPortfolioRevealAllocationComposable.kt:93)");
                        }
                        Function2<Composer, Integer, Unit> lambda$2027799885$feature_advisory_onboarding_externalDebug = AdvsoryPortfolioRevealAllocationComposable5.INSTANCE.getLambda$2027799885$feature_advisory_onboarding_externalDebug();
                        final AdvsoryPortfolioRevealAllocationComposable7 advsoryPortfolioRevealAllocationComposable7 = callbacks;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1185827679, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvsoryPortfolioRevealAllocationComposableKt.AdvisoryPortfolioRevealAllocationComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1185827679, i8, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvisoryPortfolioRevealAllocationComposable.<anonymous>.<anonymous> (AdvsoryPortfolioRevealAllocationComposable.kt:96)");
                                }
                                AdvsoryPortfolioRevealAllocationComposable7 advsoryPortfolioRevealAllocationComposable72 = advsoryPortfolioRevealAllocationComposable7;
                                composer4.startReplaceGroup(5004770);
                                boolean zChanged = composer4.changed(advsoryPortfolioRevealAllocationComposable72);
                                Object objRememberedValue2 = composer4.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new AdvsoryPortfolioRevealAllocationComposable2(advsoryPortfolioRevealAllocationComposable72);
                                    composer4.updateRememberedValue(objRememberedValue2);
                                }
                                composer4.endReplaceGroup();
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) ((KFunction) objRememberedValue2), composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        final AdvsoryPortfolioRevealAllocationComposable7 advsoryPortfolioRevealAllocationComposable72 = callbacks;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-1109415934, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvsoryPortfolioRevealAllocationComposableKt.AdvisoryPortfolioRevealAllocationComposable.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer4, Integer num) {
                                invoke(row5, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 BentoAppBar, Composer composer4, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1109415934, i8, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvisoryPortfolioRevealAllocationComposable.<anonymous>.<anonymous> (AdvsoryPortfolioRevealAllocationComposable.kt:101)");
                                }
                                AdvsoryPortfolioRevealAllocationComposable7 advsoryPortfolioRevealAllocationComposable73 = advsoryPortfolioRevealAllocationComposable72;
                                composer4.startReplaceGroup(5004770);
                                boolean zChanged = composer4.changed(advsoryPortfolioRevealAllocationComposable73);
                                Object objRememberedValue2 = composer4.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new AdvsoryPortfolioRevealAllocationComposable3(advsoryPortfolioRevealAllocationComposable73);
                                    composer4.updateRememberedValue(objRememberedValue2);
                                }
                                composer4.endReplaceGroup();
                                AdjustPortfolioButton.AdjustPortfolioButton((Function0) ((KFunction) objRememberedValue2), null, composer4, 0, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        final GetPortfolioRevealResponseDto getPortfolioRevealResponseDto = portfolioReveal;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$2027799885$feature_advisory_onboarding_externalDebug, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(188235858, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvsoryPortfolioRevealAllocationComposableKt.AdvisoryPortfolioRevealAllocationComposable.1.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                invoke(boxScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoAppBar, Composer composer4, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(188235858, i8, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvisoryPortfolioRevealAllocationComposable.<anonymous>.<anonymous> (AdvsoryPortfolioRevealAllocationComposable.kt:106)");
                                }
                                BentoProgressBar2.m20699BentoProgressBarnBX6wN0(PortfolioRevealUtils.getProgressBarSegments(getPortfolioRevealResponseDto) - 1, 0.2f, PortfolioRevealUtils.getProgressBarSegments(getPortfolioRevealResponseDto), null, 0L, 0L, false, composer4, 48, 120);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), false, false, null, null, 0L, null, composer3, 28038, 0, 2018);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(1362272683, true, new C89702(screen, context, scrollStateRememberScrollState, callbacks, asset_class_overview, str, snapshotState4), composerStartRestartGroup, 54), composer2, ((i5 >> 15) & 14) | 805306416, 316);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvsoryPortfolioRevealAllocationComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvsoryPortfolioRevealAllocationComposable.AdvisoryPortfolioRevealAllocationComposable$lambda$3(str, portfolioReveal, source, brokerageAccountType, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            asset_class_overview = portfolioReveal.getAsset_class_overview();
            if (asset_class_overview != null) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AdvisoryPortfolioRevealAllocationComposable$lambda$2(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* compiled from: AdvsoryPortfolioRevealAllocationComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvsoryPortfolioRevealAllocationComposableKt$AdvisoryPortfolioRevealAllocationComposable$2 */
    static final class C89702 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ PortfolioRevealAssetClassOverviewDto $assetClassOverview;
        final /* synthetic */ AdvsoryPortfolioRevealAllocationComposable7 $callbacks;
        final /* synthetic */ Context $eventContext;
        final /* synthetic */ SnapshotState4<Boolean> $footerDividerVisible$delegate;
        final /* synthetic */ Screen $screen;
        final /* synthetic */ String $screenTitleOverride;
        final /* synthetic */ ScrollState $scrollState;

        C89702(Screen screen, Context context, ScrollState scrollState, AdvsoryPortfolioRevealAllocationComposable7 advsoryPortfolioRevealAllocationComposable7, PortfolioRevealAssetClassOverviewDto portfolioRevealAssetClassOverviewDto, String str, SnapshotState4<Boolean> snapshotState4) {
            this.$screen = screen;
            this.$eventContext = context;
            this.$scrollState = scrollState;
            this.$callbacks = advsoryPortfolioRevealAllocationComposable7;
            this.$assetClassOverview = portfolioRevealAssetClassOverviewDto;
            this.$screenTitleOverride = str;
            this.$footerDividerVisible$delegate = snapshotState4;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            final AdvsoryPortfolioRevealAllocationComposable7 advsoryPortfolioRevealAllocationComposable7;
            Function0 function0;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            int i2 = (i & 6) == 0 ? i | (composer.changed(paddingValues) ? 4 : 2) : i;
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1362272683, i2, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvisoryPortfolioRevealAllocationComposable.<anonymous> (AdvsoryPortfolioRevealAllocationComposable.kt:115)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(ModifiersKt.logScreenTransitions(companion, new UserInteractionEventDescriptor(null, this.$screen, null, this.$eventContext, null, null, 53, null)), paddingValues);
            ScrollState scrollState = this.$scrollState;
            Screen screen = this.$screen;
            Context context = this.$eventContext;
            AdvsoryPortfolioRevealAllocationComposable7 advsoryPortfolioRevealAllocationComposable72 = this.$callbacks;
            PortfolioRevealAssetClassOverviewDto portfolioRevealAssetClassOverviewDto = this.$assetClassOverview;
            String str = this.$screenTitleOverride;
            SnapshotState4<Boolean> snapshotState4 = this.$footerDividerVisible$delegate;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), scrollState, false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            AdvsoryPortfolioRevealAllocationComposable7 advsoryPortfolioRevealAllocationComposable73 = advsoryPortfolioRevealAllocationComposable72;
            BentoText2.m20747BentoText38GnDrw(str == null ? portfolioRevealAssetClassOverviewDto.getTitle() : str, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
            Function0 function02 = null;
            float f = 0.0f;
            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(bentoTheme.getColors(composer, i3).getIsDay() ? portfolioRevealAssetClassOverviewDto.getImage_light_url() : portfolioRevealAssetClassOverviewDto.getImage_dark_url(), null, null, null, 0, null, composer, 0, 62), (String) null, SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), AdvsoryPortfolioRevealAllocationComposable.AllocationHeroImageHeight), 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
            Composer composer2 = composer;
            composer2.startReplaceGroup(-714020042);
            Composer composer3 = composer2;
            for (Iterator it = portfolioRevealAssetClassOverviewDto.getAsset_class_rows().iterator(); it.hasNext(); it = it) {
                PortfolioRevealAssetClassRowDto portfolioRevealAssetClassRowDto = (PortfolioRevealAssetClassRowDto) it.next();
                final PortfolioRevealAssetClassBreakdownDto breakdown = portfolioRevealAssetClassRowDto.getBreakdown();
                Function0 function03 = function02;
                float f2 = f;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, screen, null, context, new Component(Component.ComponentType.ROW, portfolioRevealAssetClassRowDto.getRow_identifier(), null, 4, null), null, 37, null), true, false, false, true, false, null, 108, null);
                String title = portfolioRevealAssetClassRowDto.getTitle();
                String subtitle = portfolioRevealAssetClassRowDto.getSubtitle();
                BentoBaseRowState.Meta.SingleLine singleLine = new BentoBaseRowState.Meta.SingleLine(portfolioRevealAssetClassRowDto.getAllocation_percentage());
                composer3.startReplaceGroup(-713986510);
                if (breakdown != null) {
                    composer3.startReplaceGroup(-1633490746);
                    advsoryPortfolioRevealAllocationComposable7 = advsoryPortfolioRevealAllocationComposable73;
                    boolean zChanged = composer3.changed(advsoryPortfolioRevealAllocationComposable7) | composer3.changedInstance(breakdown);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvsoryPortfolioRevealAllocationComposableKt$AdvisoryPortfolioRevealAllocationComposable$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AdvsoryPortfolioRevealAllocationComposable.C89702.invoke$lambda$5$lambda$3$lambda$2$lambda$1$lambda$0(advsoryPortfolioRevealAllocationComposable7, breakdown);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceGroup();
                    function0 = (Function0) objRememberedValue;
                } else {
                    advsoryPortfolioRevealAllocationComposable7 = advsoryPortfolioRevealAllocationComposable73;
                    function0 = function03;
                }
                composer3.endReplaceGroup();
                advsoryPortfolioRevealAllocationComposable73 = advsoryPortfolioRevealAllocationComposable7;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default, null, title, subtitle, null, singleLine, null, true, false, false, 0L, function0, composer, (BentoBaseRowState.Meta.SingleLine.$stable << 15) | 12582912, 0, 1874);
                composer3 = composer;
                f = f2;
                function02 = function03;
            }
            Composer composer4 = composer3;
            float f3 = f;
            AdvsoryPortfolioRevealAllocationComposable7 advsoryPortfolioRevealAllocationComposable74 = advsoryPortfolioRevealAllocationComposable73;
            composer4.endReplaceGroup();
            Modifier.Companion companion4 = Modifier.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            BentoMarkdownText2.BentoMarkdownText(portfolioRevealAssetClassOverviewDto.getDisclosure(), com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion4, bentoTheme2.getSpacing(composer4, i4).m21590getDefaultD9Ej5fM()), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer4, i4).getTextS(), 0, bentoTheme2.getColors(composer4, i4).m21426getFg20d7_KjU(), 0L, false, composer4, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 24);
            composer.endNode();
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(Alpha.alpha(companion4, AdvsoryPortfolioRevealAllocationComposable.AdvisoryPortfolioRevealAllocationComposable$lambda$2(snapshotState4) ? 1.0f : f3), bentoTheme2.getColors(composer, i4).m21373getBg30d7_KjU(), 0.0f, composer, 0, 4);
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(ModifiersKt.autoLogEvents$default(companion4, new UserInteractionEventDescriptor(null, screen, null, context, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 37, null), true, false, false, true, false, null, 108, null), bentoTheme2.getSpacing(composer, i4).m21590getDefaultD9Ej5fM());
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(advsoryPortfolioRevealAllocationComposable74);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new AdvsoryPortfolioRevealAllocationComposable4(advsoryPortfolioRevealAllocationComposable74);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue2), portfolioRevealAssetClassOverviewDto.getCta_text(), modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$3$lambda$2$lambda$1$lambda$0(AdvsoryPortfolioRevealAllocationComposable7 advsoryPortfolioRevealAllocationComposable7, PortfolioRevealAssetClassBreakdownDto portfolioRevealAssetClassBreakdownDto) {
            advsoryPortfolioRevealAllocationComposable7.onShowAssetClassBreakdown(portfolioRevealAssetClassBreakdownDto);
            return Unit.INSTANCE;
        }
    }
}
