package com.robinhood.android.futures.assethome;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.assethomes.shared.AssetHistoryPreviewSection;
import com.robinhood.android.assethomes.shared.AssetHistoryPreviewSection2;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.futures.assethome.FuturesAssetHomeScreen4;
import com.robinhood.android.futures.assethome.educationtour.FuturesAssetHomeEducationTourScreen;
import com.robinhood.android.futures.assethome.sections.FuturesAssetHomeBuyingPowerSection;
import com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo2;
import com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartSection;
import com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartViewState;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import futures_asset_home.proto.p462v1.SectionTypeDto;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: FuturesAssetHomeScreen.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aZ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001an\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u000b2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0018\u001a5\u0010\u0019\u001a\u00020\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u001b\u001a-\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010 \"\u000e\u0010!\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"FuturesAssetHomeScreen", "", "state", "Lcom/robinhood/android/futures/assethome/FuturesAssetHomeViewState;", "chartState", "Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartViewState;", "callbacks", "Lcom/robinhood/android/futures/assethome/FuturesAssetHomeScreenCallbacks;", "chartCallbacks", "Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartCallbacks;", "onChartLoaded", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isLoaded", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/futures/assethome/FuturesAssetHomeViewState;Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartViewState;Lcom/robinhood/android/futures/assethome/FuturesAssetHomeScreenCallbacks;Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartCallbacks;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FuturesAssetHomeContent", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "handleDeeplink", "", "(Lcom/robinhood/android/futures/assethome/FuturesAssetHomeViewState;Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartViewState;Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartCallbacks;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DisclosureSection", "disclosureMarkdown", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BottomBar", "visible", "onClick", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BottomBarEventLoggingIdentifier", "feature-futures-asset-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesAssetHomeScreen4 {
    private static final String BottomBarEventLoggingIdentifier = "asset-home-view-all-futures";

    /* compiled from: FuturesAssetHomeScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SectionTypeDto.values().length];
            try {
                iArr[SectionTypeDto.SECTION_PERFORMANCE_CHART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SectionTypeDto.SECTION_BUYING_POWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SectionTypeDto.SECTION_PENDING_ORDERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SectionTypeDto.SECTION_POSITIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SectionTypeDto.SECTION_HISTORY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SectionTypeDto.SECTION_DISCLOSURES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SectionTypeDto.SECTION_UNSPECIFIED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$6(boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BottomBar(z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisclosureSection$lambda$5(String str, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DisclosureSection(str, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesAssetHomeContent$lambda$4(FuturesAssetHomeViewState futuresAssetHomeViewState, FuturesAssetHomeChartViewState futuresAssetHomeChartViewState, FuturesAssetHomeChartDuxo2 futuresAssetHomeChartDuxo2, LazyListState lazyListState, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesAssetHomeContent(futuresAssetHomeViewState, futuresAssetHomeChartViewState, futuresAssetHomeChartDuxo2, lazyListState, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesAssetHomeScreen$lambda$0(FuturesAssetHomeViewState futuresAssetHomeViewState, FuturesAssetHomeChartViewState futuresAssetHomeChartViewState, FuturesAssetHomeScreen3 futuresAssetHomeScreen3, FuturesAssetHomeChartDuxo2 futuresAssetHomeChartDuxo2, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesAssetHomeScreen(futuresAssetHomeViewState, futuresAssetHomeChartViewState, futuresAssetHomeScreen3, futuresAssetHomeChartDuxo2, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FuturesAssetHomeScreen(final FuturesAssetHomeViewState state, final FuturesAssetHomeChartViewState chartState, final FuturesAssetHomeScreen3 callbacks, final FuturesAssetHomeChartDuxo2 chartCallbacks, final Function1<? super Boolean, Unit> onChartLoaded, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(chartState, "chartState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(chartCallbacks, "chartCallbacks");
        Intrinsics.checkNotNullParameter(onChartLoaded, "onChartLoaded");
        Composer composerStartRestartGroup = composer.startRestartGroup(537321373);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(chartState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(chartCallbacks) : composerStartRestartGroup.changedInstance(chartCallbacks) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onChartLoaded) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i3;
            if ((74899 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(537321373, i4, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeScreen (FuturesAssetHomeScreen.kt:58)");
                }
                final TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                FuturesAssetHomeEducationTourScreen.FuturesAssetHomeEducationTourScreen(state, null, null, ComposableLambda3.rememberComposableLambda(785126085, true, new Function3<LazyListState, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt.FuturesAssetHomeScreen.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyListState lazyListState, Composer composer3, Integer num) {
                        invoke(lazyListState, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final LazyListState lazyListState, Composer composer3, int i6) {
                        int i7;
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        if ((i6 & 6) == 0) {
                            i7 = i6 | (composer3.changed(lazyListState) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(785126085, i7, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeScreen.<anonymous> (FuturesAssetHomeScreen.kt:63)");
                        }
                        Modifier modifier6 = modifier4;
                        final TopBarScrollState topBarScrollState = topBarScrollStateRememberTopBarScrollState;
                        final FuturesAssetHomeChartViewState futuresAssetHomeChartViewState = chartState;
                        final FuturesAssetHomeViewState futuresAssetHomeViewState = state;
                        final FuturesAssetHomeScreen3 futuresAssetHomeScreen3 = callbacks;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(517760137, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt.FuturesAssetHomeScreen.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i8) {
                                if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(517760137, i8, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeScreen.<anonymous>.<anonymous> (FuturesAssetHomeScreen.kt:66)");
                                }
                                float opacity = topBarScrollState.getOpacity();
                                String spanGrossReturn = futuresAssetHomeChartViewState.getSpanGrossReturn();
                                boolean showToolbarSearchIcon = futuresAssetHomeViewState.getShowToolbarSearchIcon();
                                FuturesAssetHomeTopBar.FuturesAssetHomeTopBar(opacity, spanGrossReturn, futuresAssetHomeScreen3, TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, lazyListState, topBarScrollState), showToolbarSearchIcon, composer4, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        final FuturesAssetHomeViewState futuresAssetHomeViewState2 = state;
                        final FuturesAssetHomeScreen3 futuresAssetHomeScreen32 = callbacks;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(288970186, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt.FuturesAssetHomeScreen.1.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i8) {
                                if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(288970186, i8, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeScreen.<anonymous>.<anonymous> (FuturesAssetHomeScreen.kt:78)");
                                }
                                boolean showViewAllFuturesButton = futuresAssetHomeViewState2.getShowViewAllFuturesButton();
                                FuturesAssetHomeScreen3 futuresAssetHomeScreen33 = futuresAssetHomeScreen32;
                                composer4.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer4.changedInstance(futuresAssetHomeScreen33);
                                Object objRememberedValue = composer4.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new FuturesAssetHomeScreen8(futuresAssetHomeScreen33);
                                    composer4.updateRememberedValue(objRememberedValue);
                                }
                                composer4.endReplaceGroup();
                                FuturesAssetHomeScreen4.BottomBar(showViewAllFuturesButton, (Function0) ((KFunction) objRememberedValue), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer4, 384, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        final FuturesAssetHomeScreen3 futuresAssetHomeScreen33 = callbacks;
                        final FuturesAssetHomeViewState futuresAssetHomeViewState3 = state;
                        final FuturesAssetHomeChartViewState futuresAssetHomeChartViewState2 = chartState;
                        final FuturesAssetHomeChartDuxo2 futuresAssetHomeChartDuxo2 = chartCallbacks;
                        final Function1<Boolean, Unit> function1 = onChartLoaded;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(999044884, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt.FuturesAssetHomeScreen.1.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                invoke(paddingValues, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer4, int i8) {
                                int i9;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i8 & 6) == 0) {
                                    i9 = (composer4.changed(paddingValues) ? 4 : 2) | i8;
                                } else {
                                    i9 = i8;
                                }
                                if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(999044884, i9, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeScreen.<anonymous>.<anonymous> (FuturesAssetHomeScreen.kt:85)");
                                }
                                FuturesAssetHomeScreen3 futuresAssetHomeScreen34 = futuresAssetHomeScreen33;
                                composer4.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer4.changedInstance(futuresAssetHomeScreen34);
                                Object objRememberedValue = composer4.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new FuturesAssetHomeScreen9(futuresAssetHomeScreen34);
                                    composer4.updateRememberedValue(objRememberedValue);
                                }
                                composer4.endReplaceGroup();
                                FuturesAssetHomeScreen4.FuturesAssetHomeContent(futuresAssetHomeViewState3, futuresAssetHomeChartViewState2, futuresAssetHomeChartDuxo2, lazyListState, (Function1) ((KFunction) objRememberedValue), function1, SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), composer4, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 805306800, 504);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, (i4 & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FuturesAssetHomeScreen4.FuturesAssetHomeScreen$lambda$0(state, chartState, callbacks, chartCallbacks, onChartLoaded, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        i4 = i3;
        if ((74899 & i4) == 74898) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final TopBarScrollState topBarScrollStateRememberTopBarScrollState2 = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            FuturesAssetHomeEducationTourScreen.FuturesAssetHomeEducationTourScreen(state, null, null, ComposableLambda3.rememberComposableLambda(785126085, true, new Function3<LazyListState, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt.FuturesAssetHomeScreen.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyListState lazyListState, Composer composer3, Integer num) {
                    invoke(lazyListState, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final LazyListState lazyListState, Composer composer3, int i6) {
                    int i7;
                    Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                    if ((i6 & 6) == 0) {
                        i7 = i6 | (composer3.changed(lazyListState) ? 4 : 2);
                    } else {
                        i7 = i6;
                    }
                    if ((i7 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(785126085, i7, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeScreen.<anonymous> (FuturesAssetHomeScreen.kt:63)");
                    }
                    Modifier modifier6 = modifier4;
                    final TopBarScrollState topBarScrollState = topBarScrollStateRememberTopBarScrollState2;
                    final FuturesAssetHomeChartViewState futuresAssetHomeChartViewState = chartState;
                    final FuturesAssetHomeViewState futuresAssetHomeViewState = state;
                    final FuturesAssetHomeScreen3 futuresAssetHomeScreen3 = callbacks;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(517760137, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt.FuturesAssetHomeScreen.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i8) {
                            if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(517760137, i8, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeScreen.<anonymous>.<anonymous> (FuturesAssetHomeScreen.kt:66)");
                            }
                            float opacity = topBarScrollState.getOpacity();
                            String spanGrossReturn = futuresAssetHomeChartViewState.getSpanGrossReturn();
                            boolean showToolbarSearchIcon = futuresAssetHomeViewState.getShowToolbarSearchIcon();
                            FuturesAssetHomeTopBar.FuturesAssetHomeTopBar(opacity, spanGrossReturn, futuresAssetHomeScreen3, TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, lazyListState, topBarScrollState), showToolbarSearchIcon, composer4, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54);
                    final FuturesAssetHomeViewState futuresAssetHomeViewState2 = state;
                    final FuturesAssetHomeScreen3 futuresAssetHomeScreen32 = callbacks;
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(288970186, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt.FuturesAssetHomeScreen.1.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i8) {
                            if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(288970186, i8, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeScreen.<anonymous>.<anonymous> (FuturesAssetHomeScreen.kt:78)");
                            }
                            boolean showViewAllFuturesButton = futuresAssetHomeViewState2.getShowViewAllFuturesButton();
                            FuturesAssetHomeScreen3 futuresAssetHomeScreen33 = futuresAssetHomeScreen32;
                            composer4.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer4.changedInstance(futuresAssetHomeScreen33);
                            Object objRememberedValue = composer4.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new FuturesAssetHomeScreen8(futuresAssetHomeScreen33);
                                composer4.updateRememberedValue(objRememberedValue);
                            }
                            composer4.endReplaceGroup();
                            FuturesAssetHomeScreen4.BottomBar(showViewAllFuturesButton, (Function0) ((KFunction) objRememberedValue), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer4, 384, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54);
                    final FuturesAssetHomeScreen3 futuresAssetHomeScreen33 = callbacks;
                    final FuturesAssetHomeViewState futuresAssetHomeViewState3 = state;
                    final FuturesAssetHomeChartViewState futuresAssetHomeChartViewState2 = chartState;
                    final FuturesAssetHomeChartDuxo2 futuresAssetHomeChartDuxo2 = chartCallbacks;
                    final Function1<? super Boolean, Unit> function1 = onChartLoaded;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(999044884, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt.FuturesAssetHomeScreen.1.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                            invoke(paddingValues, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer4, int i8) {
                            int i9;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i8 & 6) == 0) {
                                i9 = (composer4.changed(paddingValues) ? 4 : 2) | i8;
                            } else {
                                i9 = i8;
                            }
                            if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(999044884, i9, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeScreen.<anonymous>.<anonymous> (FuturesAssetHomeScreen.kt:85)");
                            }
                            FuturesAssetHomeScreen3 futuresAssetHomeScreen34 = futuresAssetHomeScreen33;
                            composer4.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer4.changedInstance(futuresAssetHomeScreen34);
                            Object objRememberedValue = composer4.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new FuturesAssetHomeScreen9(futuresAssetHomeScreen34);
                                composer4.updateRememberedValue(objRememberedValue);
                            }
                            composer4.endReplaceGroup();
                            FuturesAssetHomeScreen4.FuturesAssetHomeContent(futuresAssetHomeViewState3, futuresAssetHomeChartViewState2, futuresAssetHomeChartDuxo2, lazyListState, (Function1) ((KFunction) objRememberedValue), function1, SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), composer4, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 805306800, 504);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (i4 & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FuturesAssetHomeContent(final FuturesAssetHomeViewState futuresAssetHomeViewState, final FuturesAssetHomeChartViewState futuresAssetHomeChartViewState, final FuturesAssetHomeChartDuxo2 futuresAssetHomeChartDuxo2, final LazyListState lazyListState, final Function1<? super String, Unit> function1, final Function1<? super Boolean, Unit> function12, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super String, Unit> function13;
        int i4;
        Modifier modifier2;
        final Function1<ReorderableLazyListScope, Unit> function1PendingOrdersSection;
        String accountNumber;
        boolean z;
        Function1<ReorderableLazyListScope, Unit> function14;
        Function1<LazyListScope, Unit> function1AssetHistoryPreviewSection;
        boolean zChangedInstance;
        Object objRememberedValue;
        int i5;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(607675315);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(futuresAssetHomeViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(futuresAssetHomeChartViewState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(futuresAssetHomeChartDuxo2) : composerStartRestartGroup.changedInstance(futuresAssetHomeChartDuxo2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(lazyListState) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    function13 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else {
                    if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
                    }
                    i4 = i2 & 64;
                    if (i4 != 0) {
                        if ((1572864 & i) == 0) {
                            modifier2 = modifier;
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                        }
                        if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(607675315, i3, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeContent (FuturesAssetHomeScreen.kt:109)");
                            }
                            function1PendingOrdersSection = PositionsSections3.pendingOrdersSection(futuresAssetHomeViewState.getAccountNumber(), composerStartRestartGroup, 0);
                            Function1<ReorderableLazyListScope, Unit> function1PositionsSection = PositionsSections3.positionsSection(futuresAssetHomeViewState.getAccountNumber(), composerStartRestartGroup, 0);
                            accountNumber = futuresAssetHomeViewState.getAccountNumber();
                            composerStartRestartGroup.startReplaceGroup(-139557306);
                            if (accountNumber != null) {
                                function1AssetHistoryPreviewSection = null;
                                z = false;
                                function14 = function1PositionsSection;
                            } else {
                                z = false;
                                function14 = function1PositionsSection;
                                function1AssetHistoryPreviewSection = AssetHistoryPreviewSection.assetHistoryPreviewSection(accountNumber, BrokerageAccountType.INDIVIDUAL, AssetHistoryPreviewSection2.FUTURES, futuresAssetHomeViewState.getFuturesSubAccountId(), null, composerStartRestartGroup, 432, 16);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance = (((i3 & 896) != 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(futuresAssetHomeChartDuxo2))) ? true : z) | composerStartRestartGroup.changedInstance(futuresAssetHomeViewState) | composerStartRestartGroup.changedInstance(futuresAssetHomeChartViewState) | ((458752 & i3) != 131072 ? true : z) | composerStartRestartGroup.changed(function1PendingOrdersSection) | composerStartRestartGroup.changed(function14) | composerStartRestartGroup.changed(function1AssetHistoryPreviewSection) | ((57344 & i3) != 16384 ? true : z);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                final Function1<LazyListScope, Unit> function15 = function1AssetHistoryPreviewSection;
                                i5 = i3;
                                final Function1<ReorderableLazyListScope, Unit> function16 = function14;
                                final Function1<? super String, Unit> function17 = function13;
                                Function1 function18 = new Function1() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return FuturesAssetHomeScreen4.FuturesAssetHomeContent$lambda$3$lambda$2(futuresAssetHomeViewState, function1PendingOrdersSection, function16, function15, futuresAssetHomeChartViewState, futuresAssetHomeChartDuxo2, function12, function17, (ReorderableLazyListScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(function18);
                                objRememberedValue = function18;
                            } else {
                                i5 = i3;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int i6 = ((i5 >> 18) & 14) | ((i5 >> 6) & 112);
                            Modifier modifier5 = modifier4;
                            ReorderableLazyColumnKt.ReorderableLazyColumn(modifier5, lazyListState, null, false, null, null, null, false, (Function1) objRememberedValue, composerStartRestartGroup, i6, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                            composerStartRestartGroup = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return FuturesAssetHomeScreen4.FuturesAssetHomeContent$lambda$4(futuresAssetHomeViewState, futuresAssetHomeChartViewState, futuresAssetHomeChartDuxo2, lazyListState, function1, function12, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    modifier2 = modifier;
                    if ((599187 & i3) != 599186) {
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function1PendingOrdersSection = PositionsSections3.pendingOrdersSection(futuresAssetHomeViewState.getAccountNumber(), composerStartRestartGroup, 0);
                        Function1<ReorderableLazyListScope, Unit> function1PositionsSection2 = PositionsSections3.positionsSection(futuresAssetHomeViewState.getAccountNumber(), composerStartRestartGroup, 0);
                        accountNumber = futuresAssetHomeViewState.getAccountNumber();
                        composerStartRestartGroup.startReplaceGroup(-139557306);
                        if (accountNumber != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        if ((i3 & 896) != 256) {
                            zChangedInstance = (((i3 & 896) != 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(futuresAssetHomeChartDuxo2))) ? true : z) | composerStartRestartGroup.changedInstance(futuresAssetHomeViewState) | composerStartRestartGroup.changedInstance(futuresAssetHomeChartViewState) | ((458752 & i3) != 131072 ? true : z) | composerStartRestartGroup.changed(function1PendingOrdersSection) | composerStartRestartGroup.changed(function14) | composerStartRestartGroup.changed(function1AssetHistoryPreviewSection) | ((57344 & i3) != 16384 ? true : z);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                                final Function1 function152 = function1AssetHistoryPreviewSection;
                                i5 = i3;
                                final Function1 function162 = function14;
                                final Function1 function172 = function13;
                                Function1 function182 = new Function1() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return FuturesAssetHomeScreen4.FuturesAssetHomeContent$lambda$3$lambda$2(futuresAssetHomeViewState, function1PendingOrdersSection, function162, function152, futuresAssetHomeChartViewState, futuresAssetHomeChartDuxo2, function12, function172, (ReorderableLazyListScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(function182);
                                objRememberedValue = function182;
                                composerStartRestartGroup.endReplaceGroup();
                                int i62 = ((i5 >> 18) & 14) | ((i5 >> 6) & 112);
                                Modifier modifier52 = modifier4;
                                ReorderableLazyColumnKt.ReorderableLazyColumn(modifier52, lazyListState, null, false, null, null, null, false, (Function1) objRememberedValue, composerStartRestartGroup, i62, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                composerStartRestartGroup = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i4 = i2 & 64;
                if (i4 != 0) {
                }
                modifier2 = modifier;
                if ((599187 & i3) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function13 = function1;
            if ((i2 & 32) != 0) {
            }
            i4 = i2 & 64;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            if ((599187 & i3) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 16) == 0) {
        }
        function13 = function1;
        if ((i2 & 32) != 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesAssetHomeContent$lambda$3$lambda$2(final FuturesAssetHomeViewState futuresAssetHomeViewState, Function1 function1, Function1 function12, Function1 function13, final FuturesAssetHomeChartViewState futuresAssetHomeChartViewState, final FuturesAssetHomeChartDuxo2 futuresAssetHomeChartDuxo2, final Function1 function14, final Function1 function15, ReorderableLazyListScope reorderableLazyListScope) {
        ReorderableLazyListScope ReorderableLazyColumn = reorderableLazyListScope;
        Intrinsics.checkNotNullParameter(ReorderableLazyColumn, "$this$ReorderableLazyColumn");
        Iterator<SectionTypeDto> it = futuresAssetHomeViewState.getAssetHomeOrder().iterator();
        while (it.hasNext()) {
            switch (WhenMappings.$EnumSwitchMapping$0[it.next().ordinal()]) {
                case 1:
                    ReorderableLazyColumn = reorderableLazyListScope;
                    LazyListScope.item$default(ReorderableLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1354958823, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt$FuturesAssetHomeContent$1$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1354958823, i, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeContent.<anonymous>.<anonymous>.<anonymous> (FuturesAssetHomeScreen.kt:127)");
                            }
                            FuturesAssetHomeChartSection.FuturesAssetHomeChartSection(futuresAssetHomeChartViewState, futuresAssetHomeChartDuxo2, null, function14, composer, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    continue;
                case 2:
                    LazyListScope.item$default(ReorderableLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1860008290, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt$FuturesAssetHomeContent$1$1$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1860008290, i, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeContent.<anonymous>.<anonymous>.<anonymous> (FuturesAssetHomeScreen.kt:135)");
                            }
                            FuturesAssetHomeBuyingPowerSection.FuturesAssetHomeBuyingPowerSection(futuresAssetHomeViewState.getBuyingPowerViewState(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), composer, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    break;
                case 3:
                    function1.invoke(ReorderableLazyColumn);
                    continue;
                case 4:
                    function12.invoke(ReorderableLazyColumn);
                    continue;
                case 5:
                    if (function13 != null) {
                        function13.invoke(ReorderableLazyColumn);
                    } else {
                        continue;
                    }
                case 6:
                    ReorderableLazyColumn = reorderableLazyListScope;
                    LazyListScope.item$default(ReorderableLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1285394338, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt$FuturesAssetHomeContent$1$1$3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1285394338, i, -1, "com.robinhood.android.futures.assethome.FuturesAssetHomeContent.<anonymous>.<anonymous>.<anonymous> (FuturesAssetHomeScreen.kt:145)");
                            }
                            FuturesAssetHomeScreen4.DisclosureSection(futuresAssetHomeViewState.getDisclosureMarkdown(), function15, null, composer, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 3, null);
                    continue;
                case 7:
                    LazyListScope.item$default(ReorderableLazyColumn, null, null, FuturesAssetHomeScreen.INSTANCE.getLambda$2071744995$feature_futures_asset_home_externalDebug(), 3, null);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            ReorderableLazyColumn = reorderableLazyListScope;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisclosureSection(final String str, final Function1<? super String, Unit> function1, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1347234601);
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
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1347234601, i3, -1, "com.robinhood.android.futures.assethome.DisclosureSection (FuturesAssetHomeScreen.kt:162)");
            }
            LocalShowPlaceholder.Loadable(str == null, null, null, ComposableLambda3.rememberComposableLambda(2028308071, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt.DisclosureSection.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2028308071, i5, -1, "com.robinhood.android.futures.assethome.DisclosureSection.<anonymous> (FuturesAssetHomeScreen.kt:164)");
                    }
                    String str2 = str;
                    if (str2 == null) {
                        str2 = "           ";
                    }
                    String str3 = str2;
                    BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    BentoMarkdownText2.BentoMarkdownText(str3, PaddingKt.m5144paddingVpY3zN4$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), 0.0f, composer2, 0, 1), 0.0f, bentoTheme.getSpacing(composer2, i6).m21591getLargeD9Ej5fM(), 1, null), bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i6).getTextS(), TextAlign.INSTANCE.m7922getLefte0LSkKk(), bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU(), false, composer2, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, function1, composer2, MarkdownStyle.$stable << 6, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesAssetHomeScreen4.DisclosureSection$lambda$5(str, function1, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: FuturesAssetHomeScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt$BottomBar$1 */
    static final class C169661 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ boolean $visible;

        C169661(boolean z, Modifier modifier, Function0<Unit> function0) {
            this.$visible = z;
            this.$modifier = modifier;
            this.$onClick = function0;
        }

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
                ComposerKt.traceEventStart(260985506, i, -1, "com.robinhood.android.futures.assethome.BottomBar.<anonymous> (FuturesAssetHomeScreen.kt:190)");
            }
            EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt$BottomBar$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(FuturesAssetHomeScreen4.C169661.invoke$lambda$1$lambda$0(((Integer) obj).intValue()));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EnterTransition enterTransitionPlus = enterTransitionFadeIn$default.plus(EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue, 1, null));
            ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt$BottomBar$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(FuturesAssetHomeScreen4.C169661.invoke$lambda$3$lambda$2(((Integer) obj).intValue()));
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            ExitTransition exitTransitionPlus = exitTransitionFadeOut$default.plus(EnterExitTransitionKt.slideOutVertically$default(null, (Function1) objRememberedValue2, 1, null));
            boolean z = this.$visible;
            Modifier modifier = this.$modifier;
            final Function0<Unit> function0 = this.$onClick;
            AnimatedVisibilityKt.AnimatedVisibility(z, modifier, enterTransitionPlus, exitTransitionPlus, "FuturesAssetHomeBottomBar", ComposableLambda3.rememberComposableLambda(254624458, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt.BottomBar.1.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(254624458, i2, -1, "com.robinhood.android.futures.assethome.BottomBar.<anonymous>.<anonymous> (FuturesAssetHomeScreen.kt:197)");
                    }
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), FuturesAssetHomeScreen4.BottomBarEventLoggingIdentifier, null, null, null, new Component(Component.ComponentType.BUTTON, FuturesAssetHomeScreen4.BottomBarEventLoggingIdentifier, null, 4, null), null, 46, null), true, false, false, true, false, null, 108, null);
                    BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                    BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C16973R.string.futures_asset_home_view_all_futures_button, composer2, 0), modifierAutoLogEvents$default, null, type2, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 224640, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$1$lambda$0(int i) {
            return i / 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$3$lambda$2(int i) {
            return i / 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomBar(final boolean z, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2136743475);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2136743475, i3, -1, "com.robinhood.android.futures.assethome.BottomBar (FuturesAssetHomeScreen.kt:188)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(260985506, true, new C169661(z, modifier, function0), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.FuturesAssetHomeScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesAssetHomeScreen4.BottomBar$lambda$6(z, function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
