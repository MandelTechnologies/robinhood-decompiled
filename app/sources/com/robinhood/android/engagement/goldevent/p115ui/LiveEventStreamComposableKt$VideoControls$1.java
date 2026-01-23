package com.robinhood.android.engagement.goldevent.p115ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.RippleKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.media3.exoplayer.ExoPlayer;
import com.robinhood.android.engagement.goldevent.LiveEventStreamViewState2;
import com.robinhood.android.engagement.goldevent.LiveEventStreamViewState3;
import com.robinhood.android.engagement.goldevent.PlaybackController;
import com.robinhood.android.engagement.goldevent.StreamingUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LiveEventStreamComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class LiveEventStreamComposableKt$VideoControls$1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ AppCompatActivity $activity;
    final /* synthetic */ long $currentPosition;
    final /* synthetic */ long $duration;
    final /* synthetic */ String $eventTitle;
    final /* synthetic */ ExoPlayer $exoPlayer;
    final /* synthetic */ boolean $isEventLive;
    final /* synthetic */ boolean $isLandscape;
    final /* synthetic */ boolean $isSeeking;
    final /* synthetic */ Function1<Long, Unit> $onSeekEnded;
    final /* synthetic */ Function0<Unit> $onSeekStarted;
    final /* synthetic */ PlaybackController $playbackController;
    final /* synthetic */ LiveEventStreamViewState3 $playbackState;
    final /* synthetic */ float $seekBarHeight;
    final /* synthetic */ long $timeBehindLive;
    final /* synthetic */ long $windowSize;

    /* compiled from: LiveEventStreamComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LiveEventStreamViewState3.values().length];
            try {
                iArr[LiveEventStreamViewState3.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LiveEventStreamViewState3.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LiveEventStreamViewState3.INITIALIZING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LiveEventStreamViewState3.BUFFERING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LiveEventStreamViewState3.ENDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    LiveEventStreamComposableKt$VideoControls$1(LiveEventStreamViewState3 liveEventStreamViewState3, boolean z, String str, PlaybackController playbackController, boolean z2, float f, long j, boolean z3, long j2, long j3, long j4, Function1<? super Long, Unit> function1, Function0<Unit> function0, ExoPlayer exoPlayer, AppCompatActivity appCompatActivity) {
        this.$playbackState = liveEventStreamViewState3;
        this.$isLandscape = z;
        this.$eventTitle = str;
        this.$playbackController = playbackController;
        this.$isSeeking = z2;
        this.$seekBarHeight = f;
        this.$currentPosition = j;
        this.$isEventLive = z3;
        this.$duration = j2;
        this.$windowSize = j3;
        this.$timeBehindLive = j4;
        this.$onSeekEnded = function1;
        this.$onSeekStarted = function0;
        this.$exoPlayer = exoPlayer;
        this.$activity = appCompatActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        BoxScopeInstance boxScopeInstance;
        AppCompatActivity appCompatActivity;
        Function0<Unit> function0;
        BentoTheme bentoTheme;
        int i2;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper22;
        Composer composer2;
        boolean z;
        LiveEventStreamViewState3 liveEventStreamViewState3;
        PlaybackController playbackController;
        boolean z2;
        ExoPlayer exoPlayer;
        Function1<Long, Unit> function1;
        long j;
        long j2;
        long j3;
        boolean z3;
        long j4;
        float f;
        Modifier.Companion companion;
        BentoTheme bentoTheme2;
        int i3;
        Modifier.Companion companion2;
        final LiveEventStreamViewState3 liveEventStreamViewState32;
        Composer composer3;
        LiveEventStreamViewState3 liveEventStreamViewState33;
        BoxScopeInstance boxScopeInstance2;
        int i4;
        float f2;
        final boolean z4;
        int i5;
        boolean z5;
        Composer composer4;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1333492565, i, -1, "com.robinhood.android.engagement.goldevent.ui.VideoControls.<anonymous> (LiveEventStreamComposable.kt:544)");
        }
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
        int i6 = BentoTheme.$stable;
        BoxKt.Box(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, Color.m6705copywmQWz5c$default(bentoTheme3.getColors(composer, i6).getJet(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 0);
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.$playbackState.ordinal()];
        if (i7 == 1) {
            serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.PAUSE_HERO_40;
        } else if (i7 == 2) {
            serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.PLAY_HERO_40;
        } else {
            if (i7 != 3 && i7 != 4 && i7 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            serverToBentoAssetMapper2 = null;
        }
        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
        boolean z6 = this.$isLandscape;
        String str = this.$eventTitle;
        LiveEventStreamViewState3 liveEventStreamViewState34 = this.$playbackState;
        PlaybackController playbackController2 = this.$playbackController;
        boolean z7 = this.$isSeeking;
        float f3 = this.$seekBarHeight;
        long j5 = this.$currentPosition;
        boolean z8 = this.$isEventLive;
        long j6 = this.$duration;
        long j7 = this.$windowSize;
        long j8 = this.$timeBehindLive;
        Function1<Long, Unit> function12 = this.$onSeekEnded;
        Function0<Unit> function02 = this.$onSeekStarted;
        ExoPlayer exoPlayer2 = this.$exoPlayer;
        AppCompatActivity appCompatActivity2 = this.$activity;
        Alignment.Companion companion4 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default2);
        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
        composer.startReplaceGroup(-1090769549);
        if (z6) {
            function0 = function02;
            bentoTheme = bentoTheme3;
            z2 = z7;
            liveEventStreamViewState3 = liveEventStreamViewState34;
            exoPlayer = exoPlayer2;
            i2 = i6;
            serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
            boxScopeInstance = boxScopeInstance3;
            playbackController = playbackController2;
            appCompatActivity = appCompatActivity2;
            z = z6;
            function1 = function12;
            j = j8;
            j2 = j7;
            j3 = j6;
            z3 = z8;
            j4 = j5;
            f = f3;
            companion = companion3;
            composer2 = composer;
            BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5142padding3ABfNKs(boxScopeInstance3.align(companion3, companion4.getTopStart()), bentoTheme3.getSpacing(composer, i6).m21591getLargeD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16380);
        } else {
            boxScopeInstance = boxScopeInstance3;
            appCompatActivity = appCompatActivity2;
            function0 = function02;
            bentoTheme = bentoTheme3;
            i2 = i6;
            serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
            composer2 = composer;
            z = z6;
            liveEventStreamViewState3 = liveEventStreamViewState34;
            playbackController = playbackController2;
            z2 = z7;
            exoPlayer = exoPlayer2;
            function1 = function12;
            j = j8;
            j2 = j7;
            j3 = j6;
            z3 = z8;
            j4 = j5;
            f = f3;
            companion = companion3;
        }
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(-1090757241);
        if (serverToBentoAssetMapper22 == null) {
            composer3 = composer2;
            companion2 = companion;
            bentoTheme2 = bentoTheme;
            liveEventStreamViewState33 = liveEventStreamViewState3;
            i3 = i2;
            boxScopeInstance2 = boxScopeInstance;
        } else {
            BentoIcon4.Size40 size40 = new BentoIcon4.Size40(serverToBentoAssetMapper22);
            bentoTheme2 = bentoTheme;
            i3 = i2;
            long jM21425getFg0d7_KjU = bentoTheme2.getColors(composer2, i3).m21425getFg0d7_KjU();
            float f4 = 48;
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(f4);
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(f4);
            Modifier.Companion companion6 = companion;
            companion2 = companion6;
            BoxScopeInstance boxScopeInstance4 = boxScopeInstance;
            Modifier modifierAlign = boxScopeInstance4.align(SizeKt.m5173sizeInqDBjuR0$default(companion6, fM7995constructorimpl, fM7995constructorimpl2, 0.0f, 0.0f, 12, null), companion4.getCenter());
            composer2.startReplaceGroup(-1633490746);
            final PlaybackController playbackController3 = playbackController;
            boolean zChanged = composer2.changed(liveEventStreamViewState3.ordinal()) | composer2.changed(playbackController3);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                liveEventStreamViewState32 = liveEventStreamViewState3;
                objRememberedValue = new Function0() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$VideoControls$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LiveEventStreamComposableKt$VideoControls$1.invoke$lambda$12$lambda$2$lambda$1$lambda$0(liveEventStreamViewState32, playbackController3);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                liveEventStreamViewState32 = liveEventStreamViewState3;
            }
            composer2.endReplaceGroup();
            composer3 = composer2;
            liveEventStreamViewState33 = liveEventStreamViewState32;
            boxScopeInstance2 = boxScopeInstance4;
            BentoIcon2.m20644BentoIconFU0evQE(size40, "Play/Pause", jM21425getFg0d7_KjU, modifierAlign, (Function0) objRememberedValue, false, composer3, BentoIcon4.Size40.$stable | 48, 32);
            Unit unit = Unit.INSTANCE;
        }
        composer3.endReplaceGroup();
        composer3.startReplaceGroup(-1090725931);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(boxScopeInstance2.align(companion2, companion4.getBottomCenter()), 0.0f, 1, null);
        boolean z9 = z;
        if (z9) {
            i4 = 2;
            modifierFillMaxWidth$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composer3, i3).m21591getLargeD9Ej5fM(), 0.0f, 2, null);
        } else {
            i4 = 2;
        }
        composer3.endReplaceGroup();
        Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
        if (composer3.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer3.startReusableNode();
        if (composer3.getInserting()) {
            composer3.createNode(constructor2);
        } else {
            composer3.useNode();
        }
        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        composer3.startReplaceGroup(-1840350255);
        if (z2) {
            f2 = 0.0f;
            z4 = z9;
            i5 = 0;
        } else {
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme2.getSpacing(composer3, i3).m21590getDefaultD9Ej5fM(), 0.0f, i4, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), companion4.getCenterVertically(), composer3, 54);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
            if (composer3.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor3);
            } else {
                composer3.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composer3.startReplaceGroup(437660319);
            if (z3 && LiveEventStreamViewState2.getShouldShowLive(liveEventStreamViewState33)) {
                boolean z10 = j < 6000;
                composer3.startReplaceGroup(5004770);
                final ExoPlayer exoPlayer3 = exoPlayer;
                boolean zChangedInstance = composer3.changedInstance(exoPlayer3);
                Object objRememberedValue2 = composer3.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$VideoControls$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiveEventStreamComposableKt$VideoControls$1.invoke$lambda$12$lambda$11$lambda$10$lambda$5$lambda$4(exoPlayer3);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue2);
                }
                composer3.endReplaceGroup();
                z5 = false;
                Composer composer5 = composer3;
                LiveEventStreamComposableKt.LiveIndicator(z10, (Function0) objRememberedValue2, null, composer5, 0, 4);
                composer4 = composer5;
            } else {
                z5 = false;
                composer4 = composer3;
            }
            composer4.endReplaceGroup();
            int i8 = i4;
            boolean z11 = z5;
            z4 = z9;
            Spacer2.Spacer(Row5.weight$default(row6, companion2, 1.0f, false, 2, null), composer4, z11 ? 1 : 0);
            composer4.startReplaceGroup(437688211);
            if (liveEventStreamViewState33 != LiveEventStreamViewState3.INITIALIZING) {
                composer4.startReplaceGroup(1849434622);
                Object objRememberedValue3 = composer4.rememberedValue();
                Composer.Companion companion7 = Composer.INSTANCE;
                if (objRememberedValue3 == companion7.getEmpty()) {
                    objRememberedValue3 = InteractionSource2.MutableInteractionSource();
                    composer4.updateRememberedValue(objRememberedValue3);
                }
                InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue3;
                composer4.endReplaceGroup();
                IndicationNodeFactory indicationNodeFactoryM5937rippleH2RKhps$default = RippleKt.m5937rippleH2RKhps$default(false, C2002Dp.m7995constructorimpl(StreamingUtils.getVIDEO_CONTROL_TOUCH_TARGET() / i8), 0L, 4, null);
                Role roleM7472boximpl = Role.m7472boximpl(Role.INSTANCE.m7479getButtono7Vup1c());
                composer4.startReplaceGroup(-1633490746);
                final AppCompatActivity appCompatActivity3 = appCompatActivity;
                boolean zChangedInstance2 = composer4.changedInstance(appCompatActivity3) | composer4.changed(z4);
                Object objRememberedValue4 = composer4.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == companion7.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$VideoControls$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiveEventStreamComposableKt$VideoControls$1.invoke$lambda$12$lambda$11$lambda$10$lambda$8$lambda$7(appCompatActivity3, z4);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue4);
                }
                composer4.endReplaceGroup();
                BoxScopeInstance boxScopeInstance5 = boxScopeInstance2;
                Modifier.Companion companion8 = companion2;
                f2 = 0.0f;
                companion2 = companion8;
                Modifier modifierM5173sizeInqDBjuR0$default = SizeKt.m5173sizeInqDBjuR0$default(ClickableKt.m4891clickableO2vRcR0$default(companion8, interactionSource3, indicationNodeFactoryM5937rippleH2RKhps$default, false, null, roleM7472boximpl, (Function0) objRememberedValue4, 12, null), StreamingUtils.getVIDEO_CONTROL_TOUCH_TARGET(), StreamingUtils.getVIDEO_CONTROL_TOUCH_TARGET(), 0.0f, 0.0f, 12, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), z11);
                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer4, z11 ? 1 : 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer4, modifierM5173sizeInqDBjuR0$default);
                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                if (composer4.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor4);
                } else {
                    composer4.useNode();
                }
                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer4);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
                BentoIcon4.Size24 size24 = z4 ? new BentoIcon4.Size24(ServerToBentoAssetMapper2.FULLSCREEN_EXIT_24) : new BentoIcon4.Size24(ServerToBentoAssetMapper2.FULLSCREEN_ENTER_24);
                long nova = bentoTheme2.getColors(composer4, i3).getNova();
                Modifier modifierAlign2 = boxScopeInstance5.align(companion2, companion4.getCenter());
                int i9 = BentoIcon4.Size24.$stable | 48;
                composer3 = composer;
                i5 = z11 ? 1 : 0;
                BentoIcon2.m20644BentoIconFU0evQE(size24, "Toggle full screen", nova, modifierAlign2, null, false, composer3, i9, 48);
                composer3.endNode();
            } else {
                composer3 = composer4;
                i5 = z11 ? 1 : 0;
                f2 = 0.0f;
            }
            composer3.endReplaceGroup();
            composer3.endNode();
        }
        composer3.endReplaceGroup();
        composer3.startReplaceGroup(-1840250788);
        if (z4) {
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme2.getSpacing(composer3, i3).m21593getSmallD9Ej5fM()), composer3, i5);
        }
        composer3.endReplaceGroup();
        LiveEventStreamComposableKt.m13511VideoSeekbarWtlUe4I(f, j4, z3, j3, j2, j, function1, function0, z4, z2, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, f2, 1, null), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f * 3) / 4), 7, null), true, composer3, 0, 48, 0);
        composer.endNode();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$2$lambda$1$lambda$0(LiveEventStreamViewState3 liveEventStreamViewState3, PlaybackController playbackController) {
        int i = WhenMappings.$EnumSwitchMapping$0[liveEventStreamViewState3.ordinal()];
        if (i == 1) {
            playbackController.onPauseRequested();
        } else if (i == 2) {
            playbackController.onPlayRequested();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11$lambda$10$lambda$5$lambda$4(ExoPlayer exoPlayer) {
        if (exoPlayer.isCommandAvailable(4)) {
            exoPlayer.seekTo(exoPlayer.getCurrentMediaItemIndex(), 0L);
            exoPlayer.seekToDefaultPosition();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11$lambda$10$lambda$8$lambda$7(AppCompatActivity appCompatActivity, boolean z) {
        LiveEventStreamComposableKt.setRotation(appCompatActivity, !z);
        return Unit.INSTANCE;
    }
}
