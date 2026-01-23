package com.robinhood.android.equities.rhvtrailer.landing;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.equities.rhvtrailer.RhvTrailerDuxo;
import com.robinhood.android.equities.rhvtrailer.RhvTrailerViewState;
import com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceen3;
import com.robinhood.android.equities.rhvtrailer.post.RhvPostTrailerScreen3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponentIdl;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.UIComponentDto;
import ventures.trailer.proto.p551v1.CalendarEventDto;
import ventures.trailer.proto.p551v1.EarlyEscapeBottomSheetDto;
import ventures.trailer.proto.p551v1.GetTrailerResponseDto;
import ventures.trailer.proto.p551v1.TrailerLandingScreenDto;

/* compiled from: RhvTrailerLandingSceen.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a;\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a5\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u000f\u001a;\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u008e\u0002"}, m3636d2 = {"RhvTrailerLandingScreen", "", "onContinueClicked", "Lkotlin/Function0;", "onBackClicked", "duxo", "Lcom/robinhood/android/equities/rhvtrailer/RhvTrailerDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/equities/rhvtrailer/RhvTrailerDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RhvTrailerLandingMainSection", "padding", "Landroidx/compose/foundation/layout/PaddingValues;", "state", "Lventures/trailer/proto/v1/TrailerLandingScreenDto;", "(Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Lventures/trailer/proto/v1/TrailerLandingScreenDto;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EarlyExitBottomSheet", WebsocketGatewayConstants.DATA_KEY, "Lventures/trailer/proto/v1/EarlyEscapeBottomSheetDto;", "onAddToCalendarClicked", "(Lventures/trailer/proto/v1/EarlyEscapeBottomSheetDto;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-rhv-trailer_externalDebug", "viewState", "Lcom/robinhood/android/equities/rhvtrailer/RhvTrailerViewState;", "showEarlyExitBottomSheet", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class RhvTrailerLandingSceen3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EarlyExitBottomSheet$lambda$14(EarlyEscapeBottomSheetDto earlyEscapeBottomSheetDto, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EarlyExitBottomSheet(earlyEscapeBottomSheetDto, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhvTrailerLandingMainSection$lambda$11(PaddingValues paddingValues, Function0 function0, TrailerLandingScreenDto trailerLandingScreenDto, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RhvTrailerLandingMainSection(paddingValues, function0, trailerLandingScreenDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhvTrailerLandingScreen$lambda$4(Function0 function0, Function0 function02, RhvTrailerDuxo rhvTrailerDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RhvTrailerLandingScreen(function0, function02, rhvTrailerDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhvTrailerLandingScreen(final Function0<Unit> onContinueClicked, final Function0<Unit> onBackClicked, final RhvTrailerDuxo duxo, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(1415737989);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onContinueClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(duxo) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1415737989, i3, -1, "com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingScreen (RhvTrailerLandingSceen.kt:50)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                GetTrailerResponseDto trailerData = RhvTrailerLandingScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle).getTrailerData();
                TrailerLandingScreenDto landing_screen = trailerData == null ? trailerData.getLanding_screen() : null;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                final Modifier modifier5 = modifier4;
                final TrailerLandingScreenDto trailerLandingScreenDto = landing_screen;
                BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1116461507, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt.RhvTrailerLandingScreen.1
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
                            ComposerKt.traceEventStart(-1116461507, i5, -1, "com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingScreen.<anonymous> (RhvTrailerLandingSceen.kt:60)");
                        }
                        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Background3.m4872backgroundbw27NRU$default(modifier5, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null));
                        final SnapshotState4<RhvTrailerViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        final TrailerLandingScreenDto trailerLandingScreenDto2 = trailerLandingScreenDto;
                        final RhvTrailerDuxo rhvTrailerDuxo = duxo;
                        final Function0<Unit> function0 = onBackClicked;
                        final SnapshotState<Boolean> snapshotState2 = snapshotState;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding, ComposableLambda3.rememberComposableLambda(1564038401, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt.RhvTrailerLandingScreen.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1564038401, i6, -1, "com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingScreen.<anonymous>.<anonymous> (RhvTrailerLandingSceen.kt:65)");
                                }
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(RhvTrailerLandingSceen.INSTANCE.m13560getLambda$1231144210$feature_rhv_trailer_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-859311550, true, new C498651(snapshotState4, trailerLandingScreenDto2, rhvTrailerDuxo, function0, snapshotState2), composer3, 54), null, null, true, false, null, null, 0L, null, composer3, 196998, 0, 2010);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: RhvTrailerLandingSceen.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$RhvTrailerLandingScreen$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C498651 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                final /* synthetic */ TrailerLandingScreenDto $data;
                                final /* synthetic */ RhvTrailerDuxo $duxo;
                                final /* synthetic */ Function0<Unit> $onBackClicked;
                                final /* synthetic */ SnapshotState<Boolean> $showEarlyExitBottomSheet$delegate;
                                final /* synthetic */ SnapshotState4<RhvTrailerViewState> $viewState$delegate;

                                C498651(SnapshotState4<RhvTrailerViewState> snapshotState4, TrailerLandingScreenDto trailerLandingScreenDto, RhvTrailerDuxo rhvTrailerDuxo, Function0<Unit> function0, SnapshotState<Boolean> snapshotState) {
                                    this.$viewState$delegate = snapshotState4;
                                    this.$data = trailerLandingScreenDto;
                                    this.$duxo = rhvTrailerDuxo;
                                    this.$onBackClicked = function0;
                                    this.$showEarlyExitBottomSheet$delegate = snapshotState;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                    invoke(bentoAppBarScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i & 6) == 0) {
                                        i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i & 19) == 18 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-859311550, i, -1, "com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingScreen.<anonymous>.<anonymous>.<anonymous> (RhvTrailerLandingSceen.kt:68)");
                                    }
                                    long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$data) | composer.changedInstance(this.$duxo) | composer.changed(this.$onBackClicked);
                                    final TrailerLandingScreenDto trailerLandingScreenDto = this.$data;
                                    final RhvTrailerDuxo rhvTrailerDuxo = this.$duxo;
                                    final Function0<Unit> function0 = this.$onBackClicked;
                                    final SnapshotState4<RhvTrailerViewState> snapshotState4 = this.$viewState$delegate;
                                    final SnapshotState<Boolean> snapshotState = this.$showEarlyExitBottomSheet$delegate;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        Function0 function02 = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$RhvTrailerLandingScreen$1$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return RhvTrailerLandingSceen3.C147711.AnonymousClass1.C498651.invoke$lambda$1$lambda$0(trailerLandingScreenDto, rhvTrailerDuxo, function0, snapshotState4, snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(function02);
                                        objRememberedValue = function02;
                                    }
                                    composer.endReplaceGroup();
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, jM21425getFg0d7_KjU, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public static final Unit invoke$lambda$1$lambda$0(TrailerLandingScreenDto trailerLandingScreenDto, RhvTrailerDuxo rhvTrailerDuxo, Function0 function0, SnapshotState4 snapshotState4, SnapshotState snapshotState) {
                                    if (RhvTrailerLandingSceen3.RhvTrailerLandingScreen$lambda$0(snapshotState4).getHasShowEarlyExitBottomSheet()) {
                                        function0.invoke();
                                    } else {
                                        if ((trailerLandingScreenDto != null ? trailerLandingScreenDto.getEarly_escape_bottom_sheet() : null) != null) {
                                            RhvTrailerLandingSceen3.RhvTrailerLandingScreen$lambda$3(snapshotState, true);
                                            rhvTrailerDuxo.onBottomSheetShown();
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1211466572, true, new AnonymousClass2(onContinueClicked, trailerLandingScreenDto, snapshotState4CollectAsStateWithLifecycle, snapshotState, onBackClicked), composer2, 54), composer2, 805306416, 508);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: RhvTrailerLandingSceen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$RhvTrailerLandingScreen$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ TrailerLandingScreenDto $data;
                        final /* synthetic */ Function0<Unit> $onBackClicked;
                        final /* synthetic */ Function0<Unit> $onContinueClicked;
                        final /* synthetic */ SnapshotState<Boolean> $showEarlyExitBottomSheet$delegate;
                        final /* synthetic */ SnapshotState4<RhvTrailerViewState> $viewState$delegate;

                        AnonymousClass2(Function0<Unit> function0, TrailerLandingScreenDto trailerLandingScreenDto, SnapshotState4<RhvTrailerViewState> snapshotState4, SnapshotState<Boolean> snapshotState, Function0<Unit> function02) {
                            this.$onContinueClicked = function0;
                            this.$data = trailerLandingScreenDto;
                            this.$viewState$delegate = snapshotState4;
                            this.$showEarlyExitBottomSheet$delegate = snapshotState;
                            this.$onBackClicked = function02;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                            int i2;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i & 6) == 0) {
                                i2 = (composer.changed(paddingValues) ? 4 : 2) | i;
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1211466572, i2, -1, "com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingScreen.<anonymous>.<anonymous> (RhvTrailerLandingSceen.kt:83)");
                            }
                            GetTrailerResponseDto trailerData = RhvTrailerLandingSceen3.RhvTrailerLandingScreen$lambda$0(this.$viewState$delegate).getTrailerData();
                            TrailerLandingScreenDto landing_screen = trailerData != null ? trailerData.getLanding_screen() : null;
                            if (landing_screen == null) {
                                composer.startReplaceGroup(283242384);
                                LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, false, false, composer, 0, 15);
                                composer.endReplaceGroup();
                            } else {
                                composer.startReplaceGroup(283244493);
                                RhvTrailerLandingSceen3.RhvTrailerLandingMainSection(paddingValues, this.$onContinueClicked, landing_screen, null, composer, i2 & 14, 8);
                                composer.endReplaceGroup();
                            }
                            if (RhvTrailerLandingSceen3.RhvTrailerLandingScreen$lambda$2(this.$showEarlyExitBottomSheet$delegate)) {
                                TrailerLandingScreenDto trailerLandingScreenDto = this.$data;
                                EarlyEscapeBottomSheetDto early_escape_bottom_sheet = trailerLandingScreenDto != null ? trailerLandingScreenDto.getEarly_escape_bottom_sheet() : null;
                                if (early_escape_bottom_sheet != null) {
                                    final Function0<Unit> function0 = this.$onBackClicked;
                                    final SnapshotState<Boolean> snapshotState = this.$showEarlyExitBottomSheet$delegate;
                                    composer.startReplaceGroup(5004770);
                                    Object objRememberedValue = composer.rememberedValue();
                                    Composer.Companion companion = Composer.INSTANCE;
                                    if (objRememberedValue == companion.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$RhvTrailerLandingScreen$1$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return RhvTrailerLandingSceen3.C147711.AnonymousClass2.invoke$lambda$4$lambda$1$lambda$0(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Function0 function02 = (Function0) objRememberedValue;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChanged = composer.changed(function0);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$RhvTrailerLandingScreen$1$2$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return RhvTrailerLandingSceen3.C147711.AnonymousClass2.invoke$lambda$4$lambda$3$lambda$2(function0, snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    RhvTrailerLandingSceen3.EarlyExitBottomSheet(early_escape_bottom_sheet, function02, (Function0) objRememberedValue2, null, composer, 48, 8);
                                }
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$1$lambda$0(SnapshotState snapshotState) {
                            RhvTrailerLandingSceen3.RhvTrailerLandingScreen$lambda$3(snapshotState, false);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function0 function0, SnapshotState snapshotState) {
                            RhvTrailerLandingSceen3.RhvTrailerLandingScreen$lambda$3(snapshotState, false);
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
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
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RhvTrailerLandingSceen3.RhvTrailerLandingScreen$lambda$4(onContinueClicked, onBackClicked, duxo, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final SnapshotState4<RhvTrailerViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            GetTrailerResponseDto trailerData2 = RhvTrailerLandingScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getTrailerData();
            if (trailerData2 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final SnapshotState<Boolean> snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final Modifier modifier52 = modifier4;
            final TrailerLandingScreenDto trailerLandingScreenDto2 = landing_screen;
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1116461507, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt.RhvTrailerLandingScreen.1
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
                        ComposerKt.traceEventStart(-1116461507, i5, -1, "com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingScreen.<anonymous> (RhvTrailerLandingSceen.kt:60)");
                    }
                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Background3.m4872backgroundbw27NRU$default(modifier52, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null));
                    final SnapshotState4<RhvTrailerViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                    final TrailerLandingScreenDto trailerLandingScreenDto22 = trailerLandingScreenDto2;
                    final RhvTrailerDuxo rhvTrailerDuxo = duxo;
                    final Function0<Unit> function0 = onBackClicked;
                    final SnapshotState<Boolean> snapshotState22 = snapshotState2;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding, ComposableLambda3.rememberComposableLambda(1564038401, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt.RhvTrailerLandingScreen.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1564038401, i6, -1, "com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingScreen.<anonymous>.<anonymous> (RhvTrailerLandingSceen.kt:65)");
                            }
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(RhvTrailerLandingSceen.INSTANCE.m13560getLambda$1231144210$feature_rhv_trailer_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-859311550, true, new C498651(snapshotState4, trailerLandingScreenDto22, rhvTrailerDuxo, function0, snapshotState22), composer3, 54), null, null, true, false, null, null, 0L, null, composer3, 196998, 0, 2010);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: RhvTrailerLandingSceen.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$RhvTrailerLandingScreen$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C498651 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ TrailerLandingScreenDto $data;
                            final /* synthetic */ RhvTrailerDuxo $duxo;
                            final /* synthetic */ Function0<Unit> $onBackClicked;
                            final /* synthetic */ SnapshotState<Boolean> $showEarlyExitBottomSheet$delegate;
                            final /* synthetic */ SnapshotState4<RhvTrailerViewState> $viewState$delegate;

                            C498651(SnapshotState4<RhvTrailerViewState> snapshotState4, TrailerLandingScreenDto trailerLandingScreenDto, RhvTrailerDuxo rhvTrailerDuxo, Function0<Unit> function0, SnapshotState<Boolean> snapshotState) {
                                this.$viewState$delegate = snapshotState4;
                                this.$data = trailerLandingScreenDto;
                                this.$duxo = rhvTrailerDuxo;
                                this.$onBackClicked = function0;
                                this.$showEarlyExitBottomSheet$delegate = snapshotState;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 6) == 0) {
                                    i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-859311550, i, -1, "com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingScreen.<anonymous>.<anonymous>.<anonymous> (RhvTrailerLandingSceen.kt:68)");
                                }
                                long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                                composer.startReplaceGroup(-1224400529);
                                boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$data) | composer.changedInstance(this.$duxo) | composer.changed(this.$onBackClicked);
                                final TrailerLandingScreenDto trailerLandingScreenDto = this.$data;
                                final RhvTrailerDuxo rhvTrailerDuxo = this.$duxo;
                                final Function0 function0 = this.$onBackClicked;
                                final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                                final SnapshotState snapshotState = this.$showEarlyExitBottomSheet$delegate;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    Function0 function02 = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$RhvTrailerLandingScreen$1$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RhvTrailerLandingSceen3.C147711.AnonymousClass1.C498651.invoke$lambda$1$lambda$0(trailerLandingScreenDto, rhvTrailerDuxo, function0, snapshotState4, snapshotState);
                                        }
                                    };
                                    composer.updateRememberedValue(function02);
                                    objRememberedValue = function02;
                                }
                                composer.endReplaceGroup();
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, jM21425getFg0d7_KjU, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static final Unit invoke$lambda$1$lambda$0(TrailerLandingScreenDto trailerLandingScreenDto, RhvTrailerDuxo rhvTrailerDuxo, Function0 function0, SnapshotState4 snapshotState4, SnapshotState snapshotState) {
                                if (RhvTrailerLandingSceen3.RhvTrailerLandingScreen$lambda$0(snapshotState4).getHasShowEarlyExitBottomSheet()) {
                                    function0.invoke();
                                } else {
                                    if ((trailerLandingScreenDto != null ? trailerLandingScreenDto.getEarly_escape_bottom_sheet() : null) != null) {
                                        RhvTrailerLandingSceen3.RhvTrailerLandingScreen$lambda$3(snapshotState, true);
                                        rhvTrailerDuxo.onBottomSheetShown();
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1211466572, true, new AnonymousClass2(onContinueClicked, trailerLandingScreenDto2, snapshotState4CollectAsStateWithLifecycle2, snapshotState2, onBackClicked), composer2, 54), composer2, 805306416, 508);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: RhvTrailerLandingSceen.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$RhvTrailerLandingScreen$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ TrailerLandingScreenDto $data;
                    final /* synthetic */ Function0<Unit> $onBackClicked;
                    final /* synthetic */ Function0<Unit> $onContinueClicked;
                    final /* synthetic */ SnapshotState<Boolean> $showEarlyExitBottomSheet$delegate;
                    final /* synthetic */ SnapshotState4<RhvTrailerViewState> $viewState$delegate;

                    AnonymousClass2(Function0<Unit> function0, TrailerLandingScreenDto trailerLandingScreenDto, SnapshotState4<RhvTrailerViewState> snapshotState4, SnapshotState<Boolean> snapshotState, Function0<Unit> function02) {
                        this.$onContinueClicked = function0;
                        this.$data = trailerLandingScreenDto;
                        this.$viewState$delegate = snapshotState4;
                        this.$showEarlyExitBottomSheet$delegate = snapshotState;
                        this.$onBackClicked = function02;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                        int i2;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i & 6) == 0) {
                            i2 = (composer.changed(paddingValues) ? 4 : 2) | i;
                        } else {
                            i2 = i;
                        }
                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1211466572, i2, -1, "com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingScreen.<anonymous>.<anonymous> (RhvTrailerLandingSceen.kt:83)");
                        }
                        GetTrailerResponseDto trailerData = RhvTrailerLandingSceen3.RhvTrailerLandingScreen$lambda$0(this.$viewState$delegate).getTrailerData();
                        TrailerLandingScreenDto landing_screen = trailerData != null ? trailerData.getLanding_screen() : null;
                        if (landing_screen == null) {
                            composer.startReplaceGroup(283242384);
                            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, false, false, composer, 0, 15);
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(283244493);
                            RhvTrailerLandingSceen3.RhvTrailerLandingMainSection(paddingValues, this.$onContinueClicked, landing_screen, null, composer, i2 & 14, 8);
                            composer.endReplaceGroup();
                        }
                        if (RhvTrailerLandingSceen3.RhvTrailerLandingScreen$lambda$2(this.$showEarlyExitBottomSheet$delegate)) {
                            TrailerLandingScreenDto trailerLandingScreenDto = this.$data;
                            EarlyEscapeBottomSheetDto early_escape_bottom_sheet = trailerLandingScreenDto != null ? trailerLandingScreenDto.getEarly_escape_bottom_sheet() : null;
                            if (early_escape_bottom_sheet != null) {
                                final Function0 function0 = this.$onBackClicked;
                                final SnapshotState snapshotState = this.$showEarlyExitBottomSheet$delegate;
                                composer.startReplaceGroup(5004770);
                                Object objRememberedValue = composer.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$RhvTrailerLandingScreen$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RhvTrailerLandingSceen3.C147711.AnonymousClass2.invoke$lambda$4$lambda$1$lambda$0(snapshotState);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function02 = (Function0) objRememberedValue;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(-1633490746);
                                boolean zChanged = composer.changed(function0);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$RhvTrailerLandingScreen$1$2$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RhvTrailerLandingSceen3.C147711.AnonymousClass2.invoke$lambda$4$lambda$3$lambda$2(function0, snapshotState);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                RhvTrailerLandingSceen3.EarlyExitBottomSheet(early_escape_bottom_sheet, function02, (Function0) objRememberedValue2, null, composer, 48, 8);
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$4$lambda$1$lambda$0(SnapshotState snapshotState) {
                        RhvTrailerLandingSceen3.RhvTrailerLandingScreen$lambda$3(snapshotState, false);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function0 function0, SnapshotState snapshotState) {
                        RhvTrailerLandingSceen3.RhvTrailerLandingScreen$lambda$3(snapshotState, false);
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RhvTrailerLandingScreen$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhvTrailerViewState RhvTrailerLandingScreen$lambda$0(SnapshotState4<RhvTrailerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RhvTrailerLandingScreen$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: RhvTrailerLandingSceen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$EarlyExitBottomSheet$2 */
    static final class C147702 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ EarlyEscapeBottomSheetDto $data;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onAddToCalendarClicked;
        final /* synthetic */ Function0<Unit> $onBackClicked;

        C147702(Modifier modifier, EarlyEscapeBottomSheetDto earlyEscapeBottomSheetDto, Context context, Function0<Unit> function0, Function0<Unit> function02) {
            this.$modifier = modifier;
            this.$data = earlyEscapeBottomSheetDto;
            this.$context = context;
            this.$onAddToCalendarClicked = function0;
            this.$onBackClicked = function02;
        }

        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            Object obj;
            int i2;
            float f;
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(175029127, i, -1, "com.robinhood.android.equities.rhvtrailer.landing.EarlyExitBottomSheet.<anonymous> (RhvTrailerLandingSceen.kt:188)");
            }
            Modifier modifier = this.$modifier;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(modifier, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM());
            final EarlyEscapeBottomSheetDto earlyEscapeBottomSheetDto = this.$data;
            final Context context = this.$context;
            final Function0<Unit> function0 = this.$onAddToCalendarClicked;
            Function0<Unit> function02 = this.$onBackClicked;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            UIComponentDto header = earlyEscapeBottomSheetDto.getHeader();
            composer.startReplaceGroup(-1939033701);
            if (header != null) {
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 5, null);
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$EarlyExitBottomSheet$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return RhvTrailerLandingSceen3.C147702.invoke$lambda$9$lambda$2$lambda$1$lambda$0((ActionDto) obj2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                SduiComponentIdl.SduiComponent(header, (Function1) objRememberedValue, modifierM5146paddingqDBjuR0$default, (HorizontalPadding) null, composer, 48, 8);
            }
            composer.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BoxKt.Box(Background3.background$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), C2002Dp.m7995constructorimpl(1)), Brush.Companion.m6676horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4283719009L), 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color2.Color(4283719009L)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4283719009L), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer, 6);
            UIComponentDto body = earlyEscapeBottomSheetDto.getBody();
            composer.startReplaceGroup(-1939004309);
            if (body == null) {
                f = 0.0f;
                i2 = 1;
                obj = null;
            } else {
                Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 1, null);
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$EarlyExitBottomSheet$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return RhvTrailerLandingSceen3.C147702.invoke$lambda$9$lambda$5$lambda$4$lambda$3((ActionDto) obj2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                obj = null;
                i2 = 1;
                f = 0.0f;
                SduiComponentIdl.SduiComponent(body, (Function1) objRememberedValue2, modifierM5144paddingVpY3zN4$default, (HorizontalPadding) null, composer, 48, 8);
            }
            composer.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, f, i2, obj);
            String primary_cta_text = earlyEscapeBottomSheetDto.getPrimary_cta_text();
            String secondary_cta_text = earlyEscapeBottomSheetDto.getSecondary_cta_text();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(earlyEscapeBottomSheetDto) | composer.changedInstance(context) | composer.changed(function0);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$EarlyExitBottomSheet$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhvTrailerLandingSceen3.C147702.invoke$lambda$9$lambda$8$lambda$7(earlyEscapeBottomSheetDto, function0, context);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierFillMaxWidth$default, null, null, false, null, null, (Function0) objRememberedValue3, primary_cta_text, false, null, false, function02, secondary_cta_text, false, null, false, composer, 6, 0, 59198);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$2$lambda$1$lambda$0(ActionDto actionDto) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$5$lambda$4$lambda$3(ActionDto actionDto) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8$lambda$7(EarlyEscapeBottomSheetDto earlyEscapeBottomSheetDto, Function0 function0, Context context) {
            CalendarEventDto calendar_event2 = earlyEscapeBottomSheetDto.getCalendar_event();
            if (calendar_event2 != null) {
                RhvPostTrailerScreen3.addEventToCalendar(context, calendar_event2);
            }
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhvTrailerLandingMainSection(final PaddingValues padding, final Function0<Unit> onContinueClicked, final TrailerLandingScreenDto state, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        UIComponentDto body;
        Composer composer3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1458142242);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(padding) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1458142242, i4, -1, "com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingMainSection (RhvTrailerLandingSceen.kt:115)");
                }
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                Modifier modifier5 = modifier4;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifier4, androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(padding, layoutDirection), 0.0f, androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(padding, layoutDirection), padding.getBottom(), 2, null), 0.0f, 1, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(state.getBackground_image_url(), null, null, null, 0, null, composerStartRestartGroup, 0, 62);
                ContentScale crop = ContentScale.INSTANCE.getCrop();
                Alignment center = companion.getCenter();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, boxScopeInstance.matchParentSize(companion3), center, crop, 0.0f, (ColorFilter) null, composerStartRestartGroup, 27696, 96);
                composer2 = composerStartRestartGroup;
                Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), companion.getBottomCenter());
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer2, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierAlign);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), C2002Dp.m7995constructorimpl(50));
                Brush.Companion companion4 = Brush.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                BoxKt.Box(Background3.background$default(modifierM5156height3ABfNKs, Brush.Companion.m6682verticalGradient8A3gB4$default(companion4, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU()), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())}), Float.POSITIVE_INFINITY, 0.0f, 0, 8, (Object) null), null, 0.0f, 6, null), composer2, 0);
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer2, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                body = state.getBody();
                composer2.startReplaceGroup(-164438579);
                if (body != null) {
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RhvTrailerLandingSceen3.m1949x688fa81e((ActionDto) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    SduiComponentIdl.SduiComponent(body, (Function1) objRememberedValue, (Modifier) null, (HorizontalPadding) null, composer2, 48, 12);
                    composer2 = composer2;
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                Composer composer4 = composer2;
                BentoButtonKt.m20586BentoButtonEikTQX8(onContinueClicked, state.getCta_text(), PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion3, bentoTheme.getSpacing(composer2, i6).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer4, (i4 >> 3) & 14, 0, 8184);
                composer3 = composer4;
                composer3.endNode();
                composer3.endNode();
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RhvTrailerLandingSceen3.RhvTrailerLandingMainSection$lambda$11(padding, onContinueClicked, state, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Modifier modifier52 = modifier4;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifier4, androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(padding, layoutDirection2), 0.0f, androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(padding, layoutDirection2), padding.getBottom(), 2, null), 0.0f, 1, null);
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg2 = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(state.getBackground_image_url(), null, null, null, 0, null, composerStartRestartGroup, 0, 62);
                ContentScale crop2 = ContentScale.INSTANCE.getCrop();
                Alignment center2 = companion5.getCenter();
                Modifier.Companion companion32 = Modifier.INSTANCE;
                ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg2, (String) null, boxScopeInstance2.matchParentSize(companion32), center2, crop2, 0.0f, (ColorFilter) null, composerStartRestartGroup, 27696, 96);
                composer2 = composerStartRestartGroup;
                Modifier modifierAlign2 = boxScopeInstance2.align(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), companion5.getBottomCenter());
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion5.getStart(), composer2, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierAlign2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composer2.getApplier() == null) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), C2002Dp.m7995constructorimpl(50));
                    Brush.Companion companion42 = Brush.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    BoxKt.Box(Background3.background$default(modifierM5156height3ABfNKs2, Brush.Companion.m6682verticalGradient8A3gB4$default(companion42, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(bentoTheme2.getColors(composer2, i62).m21371getBg0d7_KjU()), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())}), Float.POSITIVE_INFINITY, 0.0f, 0, 8, (Object) null), null, 0.0f, 6, null), composer2, 0);
                    Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), bentoTheme2.getColors(composer2, i62).m21371getBg0d7_KjU(), null, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion5.getStart(), composer2, 0);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default2);
                    Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                    if (composer2.getApplier() == null) {
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                        body = state.getBody();
                        composer2.startReplaceGroup(-164438579);
                        if (body != null) {
                        }
                        composer2.endReplaceGroup();
                        Composer composer42 = composer2;
                        BentoButtonKt.m20586BentoButtonEikTQX8(onContinueClicked, state.getCta_text(), PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion32, bentoTheme2.getSpacing(composer2, i62).m21591getLargeD9Ej5fM(), bentoTheme2.getSpacing(composer2, i62).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer42, (i4 >> 3) & 14, 0, 8184);
                        composer3 = composer42;
                        composer3.endNode();
                        composer3.endNode();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RhvTrailerLandingMainSection$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5 */
    public static final Unit m1949x688fa81e(ActionDto actionDto) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EarlyExitBottomSheet(final EarlyEscapeBottomSheetDto data, final Function0<Unit> onAddToCalendarClicked, final Function0<Unit> onBackClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onAddToCalendarClicked, "onAddToCalendarClicked");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-554285586);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAddToCalendarClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-554285586, i3, -1, "com.robinhood.android.equities.rhvtrailer.landing.EarlyExitBottomSheet (RhvTrailerLandingSceen.kt:182)");
                }
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(175029127, true, new C147702(modifier5, data, context, onAddToCalendarClicked, onBackClicked), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 62);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RhvTrailerLandingSceen3.EarlyExitBottomSheet$lambda$14(data, onAddToCalendarClicked, onBackClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier52 = modifier4;
            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(175029127, true, new C147702(modifier52, data, context2, onAddToCalendarClicked, onBackClicked), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 62);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
