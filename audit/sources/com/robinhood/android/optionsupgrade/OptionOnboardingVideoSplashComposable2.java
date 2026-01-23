package com.robinhood.android.optionsupgrade;

import android.app.Activity;
import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.p014ui.PlayerView;
import androidx.view.ComponentActivity;
import androidx.view.EdgeToEdge;
import androidx.view.SystemBarStyle;
import androidx.view.compose.LocalActivity;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoImage;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: OptionOnboardingVideoSplashComposable.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0016\u001a5\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001f\u001a'\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010!\u001a\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0003\u001a\r\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010'\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006(²\u0006\n\u0010\u0018\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\f\u0010)\u001a\u0004\u0018\u00010\u0001X\u008a\u008e\u0002"}, m3636d2 = {"L0_SLAB", "", "L0_FOLD", "L0_FALLBACK", "L0_FALLBACK_FOLD", "L2_SLAB", "L2_FOLD", "L2_FALLBACK", "L2_FALLBACK_FOLD", "OptionOnboardingVideoSplashComposable", "", "onContinueClicked", "Lkotlin/Function0;", "onBackPressed", "modifier", "Landroidx/compose/ui/Modifier;", "title", ErrorBundle.SUMMARY_ENTRY, "footerMarkdown", "isLoading", "", "isL2", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLandroidx/compose/runtime/Composer;II)V", "VideoContent", "isVideoReady", "hasError", "aspectRatio", "", "exoPlayer", "Landroidx/media3/exoplayer/ExoPlayer;", "fallbackImageUrl", "(ZZFLandroidx/media3/exoplayer/ExoPlayer;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ScrollableContent", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "createOptimizedPlayer", "context", "Landroid/content/Context;", "rememberFoldMode", "Lcom/robinhood/android/optionsupgrade/FoldMode;", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/optionsupgrade/FoldMode;", "feature-options-upgrade_externalDebug", "currentUrl"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingVideoSplashComposable2 {
    private static final String L0_FALLBACK = "https://cdn.robinhood.com/app_assets/options/onboarding/l0_fallback.jpg";
    private static final String L0_FALLBACK_FOLD = "https://cdn.robinhood.com/app_assets/options/onboarding/l0_fallback_foldable.jpg";
    private static final String L0_FOLD = "https://cdn.robinhood.com/app_assets/options/onboarding/l0_3d_foldable.mp4";
    private static final String L0_SLAB = "https://cdn.robinhood.com/app_assets/options/onboarding/l0_slab.mp4";
    private static final String L2_FALLBACK = "https://cdn.robinhood.com/app_assets/options/onboarding/l2_fallback.jpg";
    private static final String L2_FALLBACK_FOLD = "https://cdn.robinhood.com/app_assets/options/onboarding/l2_fallback_foldable.jpg";
    private static final String L2_FOLD = "https://cdn.robinhood.com/app_assets/options/onboarding/l2_3d_foldable.mp4";
    private static final String L2_SLAB = "https://cdn.robinhood.com/app_assets/options/onboarding/l2_3d_portrait.mp4";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOnboardingVideoSplashComposable$lambda$17(Function0 function0, Function0 function02, Modifier modifier, String str, String str2, String str3, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        OptionOnboardingVideoSplashComposable(function0, function02, modifier, str, str2, str3, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollableContent$lambda$24(String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ScrollableContent(str, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoContent$lambda$22(boolean z, boolean z2, float f, ExoPlayer exoPlayer, String str, int i, Composer composer, int i2) {
        VideoContent(z, z2, f, exoPlayer, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean OptionOnboardingVideoSplashComposable$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean OptionOnboardingVideoSplashComposable$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String OptionOnboardingVideoSplashComposable$lambda$7(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionOnboardingVideoSplashComposable(final Function0<Unit> onContinueClicked, final Function0<Unit> onBackPressed, Modifier modifier, String str, String str2, String str3, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str4;
        int i5;
        String str5;
        int i6;
        String str6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        final Context context;
        final LifecycleOwner lifecycleOwner;
        Object objRememberedValue;
        Composer.Companion companion;
        int i10;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        final SnapshotState snapshotState2;
        Object objRememberedValue3;
        SnapshotState snapshotState3;
        boolean zChanged;
        Object objRememberedValue4;
        final ExoPlayer exoPlayer;
        String str7;
        boolean zChanged2;
        Object objRememberedValue5;
        ComponentActivity componentActivity;
        boolean zChangedInstance;
        Object objRememberedValue6;
        final ComponentActivity componentActivity2;
        final boolean isDay;
        boolean zChangedInstance2;
        Object objRememberedValue7;
        Composer composer2;
        final boolean z4;
        final Modifier modifier3;
        final String str8;
        final boolean z5;
        final String str9;
        final String str10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-106465330);
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
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    str4 = str;
                    i3 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        str5 = str2;
                        i3 |= composerStartRestartGroup.changed(str5) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else {
                        if ((196608 & i) == 0) {
                            str6 = str3;
                            i3 |= composerStartRestartGroup.changed(str6) ? 131072 : 65536;
                        }
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                            z3 = z;
                        } else {
                            z3 = z;
                            if ((i & 1572864) == 0) {
                                i3 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                            }
                        }
                        i8 = i2 & 128;
                        if (i8 == 0) {
                            if ((i & 12582912) == 0) {
                                i9 = i8;
                                i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                            }
                            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                final Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                final String str11 = i4 == 0 ? "" : str4;
                                final String str12 = i5 == 0 ? "" : str5;
                                if (i6 != 0) {
                                    str6 = "";
                                }
                                if (i7 != 0) {
                                    z3 = false;
                                }
                                boolean z6 = i9 == 0 ? false : z2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-106465330, i3, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposable (OptionOnboardingVideoSplashComposable.kt:100)");
                                }
                                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue != companion.getEmpty()) {
                                    i10 = 2;
                                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    i10 = 2;
                                }
                                snapshotState = (SnapshotState) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i10, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                snapshotState2 = (SnapshotState) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                boolean z7 = z6;
                                if (objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, i10, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                snapshotState3 = (SnapshotState) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                zChanged = composerStartRestartGroup.changed(context);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = createOptimizedPlayer(context);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                exoPlayer = (ExoPlayer) objRememberedValue4;
                                composerStartRestartGroup.endReplaceGroup();
                                boolean z8 = rememberFoldMode(composerStartRestartGroup, 0) == OptionOnboardingVideoSplashComposable.SLAB;
                                str7 = !z8 ? z7 ? L2_FOLD : L0_FOLD : z7 ? L2_SLAB : L0_SLAB;
                                final float f = !z8 ? 1.7777778f : 1.0f;
                                final String str13 = !z8 ? z7 ? L2_FALLBACK_FOLD : L0_FALLBACK_FOLD : z7 ? L2_FALLBACK : L0_FALLBACK;
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                zChanged2 = composerStartRestartGroup.changed(str7) | composerStartRestartGroup.changedInstance(exoPlayer);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                                    componentActivity = null;
                                    objRememberedValue5 = new OptionOnboardingVideoSplashComposable3(str7, exoPlayer, snapshotState3, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                } else {
                                    componentActivity = null;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(str7, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                zChangedInstance = composerStartRestartGroup.changedInstance(exoPlayer) | composerStartRestartGroup.changedInstance(lifecycleOwner);
                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return OptionOnboardingVideoSplashComposable2.OptionOnboardingVideoSplashComposable$lambda$13$lambda$12(lifecycleOwner, exoPlayer, snapshotState, snapshotState2, (DisposableEffectScope) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycleOwner, exoPlayer, (Function1) objRememberedValue6, composerStartRestartGroup, 0);
                                Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                                componentActivity2 = !(objConsume instanceof ComponentActivity) ? (ComponentActivity) objConsume : componentActivity;
                                isDay = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
                                Boolean boolValueOf = Boolean.valueOf(isDay);
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                zChangedInstance2 = composerStartRestartGroup.changedInstance(componentActivity2) | composerStartRestartGroup.changed(isDay);
                                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance2 || objRememberedValue7 == companion.getEmpty()) {
                                    objRememberedValue7 = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return OptionOnboardingVideoSplashComposable2.OptionOnboardingVideoSplashComposable$lambda$16$lambda$15(componentActivity2, isDay, (DisposableEffectScope) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.DisposableEffect(boolValueOf, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composerStartRestartGroup, 0);
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1704462738, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt.OptionOnboardingVideoSplashComposable.4
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i12) {
                                        if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1704462738, i12, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposable.<anonymous> (OptionOnboardingVideoSplashComposable.kt:209)");
                                        }
                                        OptionOnboardingImprovementSplashComposable3.m17404TopbargKt5lHk(onBackPressed, null, Color.m6701boximpl(Color.INSTANCE.m6727getWhite0d7_KjU()), composer3, 384, 2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54);
                                final boolean z9 = z3;
                                final String str14 = str6;
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-443938093, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt.OptionOnboardingVideoSplashComposable.5
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i12) {
                                        if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-443938093, i12, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposable.<anonymous> (OptionOnboardingVideoSplashComposable.kt:215)");
                                        }
                                        OptionOnboardingImprovementSplashComposable3.m17403BottomBar88mDfTA(true, str14, z9, onContinueClicked, context, navigator, null, 0L, composer3, 6, 192);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54);
                                Function3<PaddingValues, Composer, Integer, Unit> function3 = new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt.OptionOnboardingVideoSplashComposable.6
                                    public final void invoke(PaddingValues padding, Composer composer3, int i12) {
                                        int i13;
                                        Intrinsics.checkNotNullParameter(padding, "padding");
                                        if ((i12 & 6) == 0) {
                                            i13 = i12 | (composer3.changed(padding) ? 4 : 2);
                                        } else {
                                            i13 = i12;
                                        }
                                        if ((i13 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(331058205, i13, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposable.<anonymous> (OptionOnboardingVideoSplashComposable.kt:225)");
                                        }
                                        Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, padding.getBottom(), 7, null));
                                        float f2 = f;
                                        ExoPlayer exoPlayer2 = exoPlayer;
                                        String str15 = str13;
                                        SnapshotState<Boolean> snapshotState4 = snapshotState;
                                        SnapshotState<Boolean> snapshotState5 = snapshotState2;
                                        String str16 = str11;
                                        String str17 = str12;
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composer3, 0);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
                                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        OptionOnboardingVideoSplashComposable2.VideoContent(OptionOnboardingVideoSplashComposable2.OptionOnboardingVideoSplashComposable$lambda$1(snapshotState4), OptionOnboardingVideoSplashComposable2.OptionOnboardingVideoSplashComposable$lambda$4(snapshotState5), f2, exoPlayer2, str15, composer3, 0);
                                        Modifier modifierWeight$default = Column5.weight$default(column6, PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), 1.0f, false, 2, null);
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                                        OptionOnboardingVideoSplashComposable2.ScrollableContent(str16, str17, null, composer3, 0, 4);
                                        composer3.endNode();
                                        composer3.endNode();
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                        invoke(paddingValues, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                };
                                Modifier modifier5 = modifier4;
                                composer2 = composerStartRestartGroup;
                                ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(331058205, true, function3, composerStartRestartGroup, 54), composer2, 805306800, 505);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z4 = z7;
                                modifier3 = modifier5;
                                str8 = str14;
                                z5 = z3;
                                str9 = str11;
                                str10 = str12;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z4 = z2;
                                composer2 = composerStartRestartGroup;
                                modifier3 = modifier2;
                                str9 = str4;
                                str8 = str6;
                                z5 = z3;
                                str10 = str5;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return OptionOnboardingVideoSplashComposable2.OptionOnboardingVideoSplashComposable$lambda$17(onContinueClicked, onBackPressed, modifier3, str9, str10, str8, z5, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        i9 = i8;
                        if ((i3 & 4793491) == 4793490) {
                            if (i11 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                            lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue != companion.getEmpty()) {
                            }
                            snapshotState = (SnapshotState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                            }
                            snapshotState2 = (SnapshotState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            boolean z72 = z6;
                            if (objRememberedValue3 == companion.getEmpty()) {
                            }
                            snapshotState3 = (SnapshotState) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChanged = composerStartRestartGroup.changed(context);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue4 = createOptimizedPlayer(context);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                exoPlayer = (ExoPlayer) objRememberedValue4;
                                composerStartRestartGroup.endReplaceGroup();
                                if (rememberFoldMode(composerStartRestartGroup, 0) == OptionOnboardingVideoSplashComposable.SLAB) {
                                }
                                if (!z8) {
                                }
                                final float f2 = !z8 ? 1.7777778f : 1.0f;
                                final String str132 = !z8 ? z72 ? L2_FALLBACK_FOLD : L0_FALLBACK_FOLD : z72 ? L2_FALLBACK : L0_FALLBACK;
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                zChanged2 = composerStartRestartGroup.changed(str7) | composerStartRestartGroup.changedInstance(exoPlayer);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    componentActivity = null;
                                    objRememberedValue5 = new OptionOnboardingVideoSplashComposable3(str7, exoPlayer, snapshotState3, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(str7, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    zChangedInstance = composerStartRestartGroup.changedInstance(exoPlayer) | composerStartRestartGroup.changedInstance(lifecycleOwner);
                                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (!zChangedInstance) {
                                        objRememberedValue6 = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return OptionOnboardingVideoSplashComposable2.OptionOnboardingVideoSplashComposable$lambda$13$lambda$12(lifecycleOwner, exoPlayer, snapshotState, snapshotState2, (DisposableEffectScope) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.DisposableEffect(lifecycleOwner, exoPlayer, (Function1) objRememberedValue6, composerStartRestartGroup, 0);
                                        Object objConsume2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                                        if (!(objConsume2 instanceof ComponentActivity)) {
                                        }
                                        isDay = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
                                        Boolean boolValueOf2 = Boolean.valueOf(isDay);
                                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                                        zChangedInstance2 = composerStartRestartGroup.changedInstance(componentActivity2) | composerStartRestartGroup.changed(isDay);
                                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                        if (!zChangedInstance2) {
                                            objRememberedValue7 = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt$$ExternalSyntheticLambda3
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return OptionOnboardingVideoSplashComposable2.OptionOnboardingVideoSplashComposable$lambda$16$lambda$15(componentActivity2, isDay, (DisposableEffectScope) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                            composerStartRestartGroup.endReplaceGroup();
                                            EffectsKt.DisposableEffect(boolValueOf2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composerStartRestartGroup, 0);
                                            ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(1704462738, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt.OptionOnboardingVideoSplashComposable.4
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    invoke(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer3, int i12) {
                                                    if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1704462738, i12, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposable.<anonymous> (OptionOnboardingVideoSplashComposable.kt:209)");
                                                    }
                                                    OptionOnboardingImprovementSplashComposable3.m17404TopbargKt5lHk(onBackPressed, null, Color.m6701boximpl(Color.INSTANCE.m6727getWhite0d7_KjU()), composer3, 384, 2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composerStartRestartGroup, 54);
                                            final boolean z92 = z3;
                                            final String str142 = str6;
                                            ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(-443938093, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt.OptionOnboardingVideoSplashComposable.5
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    invoke(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer3, int i12) {
                                                    if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-443938093, i12, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposable.<anonymous> (OptionOnboardingVideoSplashComposable.kt:215)");
                                                    }
                                                    OptionOnboardingImprovementSplashComposable3.m17403BottomBar88mDfTA(true, str142, z92, onContinueClicked, context, navigator2, null, 0L, composer3, 6, 192);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composerStartRestartGroup, 54);
                                            Function3<PaddingValues, Composer, Integer, Unit> function32 = new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt.OptionOnboardingVideoSplashComposable.6
                                                public final void invoke(PaddingValues padding, Composer composer3, int i12) {
                                                    int i13;
                                                    Intrinsics.checkNotNullParameter(padding, "padding");
                                                    if ((i12 & 6) == 0) {
                                                        i13 = i12 | (composer3.changed(padding) ? 4 : 2);
                                                    } else {
                                                        i13 = i12;
                                                    }
                                                    if ((i13 & 19) == 18 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(331058205, i13, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposable.<anonymous> (OptionOnboardingVideoSplashComposable.kt:225)");
                                                    }
                                                    Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, padding.getBottom(), 7, null));
                                                    float f22 = f2;
                                                    ExoPlayer exoPlayer2 = exoPlayer;
                                                    String str15 = str132;
                                                    SnapshotState<Boolean> snapshotState4 = snapshotState;
                                                    SnapshotState<Boolean> snapshotState5 = snapshotState2;
                                                    String str16 = str11;
                                                    String str17 = str12;
                                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
                                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                                    if (composer3.getApplier() == null) {
                                                        Composables.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composer3, 0);
                                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
                                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                                    Column6 column6 = Column6.INSTANCE;
                                                    OptionOnboardingVideoSplashComposable2.VideoContent(OptionOnboardingVideoSplashComposable2.OptionOnboardingVideoSplashComposable$lambda$1(snapshotState4), OptionOnboardingVideoSplashComposable2.OptionOnboardingVideoSplashComposable$lambda$4(snapshotState5), f22, exoPlayer2, str15, composer3, 0);
                                                    Modifier modifierWeight$default = Column5.weight$default(column6, PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), 1.0f, false, 2, null);
                                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                                                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                    }
                                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                                                    OptionOnboardingVideoSplashComposable2.ScrollableContent(str16, str17, null, composer3, 0, 4);
                                                    composer3.endNode();
                                                    composer3.endNode();
                                                    composer3.endNode();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                                    invoke(paddingValues, composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            Modifier modifier52 = modifier4;
                                            composer2 = composerStartRestartGroup;
                                            ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda22, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(331058205, true, function32, composerStartRestartGroup, 54), composer2, 805306800, 505);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            z4 = z72;
                                            modifier3 = modifier52;
                                            str8 = str142;
                                            z5 = z3;
                                            str9 = str11;
                                            str10 = str12;
                                        }
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    str6 = str3;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    if ((i3 & 4793491) == 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                str5 = str2;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                str6 = str3;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i3 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str4 = str;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            str5 = str2;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            str6 = str3;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str4 = str;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        str5 = str2;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        str6 = str3;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionOnboardingVideoSplashComposable$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionOnboardingVideoSplashComposable$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.media3.common.Player$Listener, com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt$OptionOnboardingVideoSplashComposable$2$1$listener$1] */
    public static final DisposableEffectResult OptionOnboardingVideoSplashComposable$lambda$13$lambda$12(final LifecycleOwner lifecycleOwner, final ExoPlayer exoPlayer, final SnapshotState snapshotState, final SnapshotState snapshotState2, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt$OptionOnboardingVideoSplashComposable$2$1$observer$1

            /* compiled from: OptionOnboardingVideoSplashComposable.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt$OptionOnboardingVideoSplashComposable$2$1$observer$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                if (i == 1) {
                    exoPlayer.setPlayWhenReady(true);
                } else if (i == 2) {
                    exoPlayer.setPlayWhenReady(false);
                } else {
                    if (i != 3) {
                        return;
                    }
                    exoPlayer.release();
                }
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        final ?? r0 = new Player.Listener() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt$OptionOnboardingVideoSplashComposable$2$1$listener$1
            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
                super.onAudioAttributesChanged(audioAttributes);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
                super.onAudioSessionIdChanged(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
                super.onAvailableCommandsChanged(commands);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onCues(CueGroup cueGroup) {
                super.onCues(cueGroup);
            }

            @Override // androidx.media3.common.Player.Listener
            @Deprecated
            public /* bridge */ /* synthetic */ void onCues(List list) {
                super.onCues((List<Cue>) list);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
                super.onDeviceInfoChanged(deviceInfo);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
                super.onDeviceVolumeChanged(i, z);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onEvents(Player player, Player.Events events) {
                super.onEvents(player, events);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
                super.onIsLoadingChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z) {
                super.onIsPlayingChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
                super.onLoadingChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
                super.onMaxSeekToPreviousPositionChanged(j);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
                super.onMediaItemTransition(mediaItem, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
                super.onMediaMetadataChanged(mediaMetadata);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onMetadata(androidx.media3.common.Metadata metadata) {
                super.onMetadata(metadata);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
                super.onPlayWhenReadyChanged(z, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                super.onPlaybackParametersChanged(playbackParameters);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
                super.onPlaybackSuppressionReasonChanged(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
                super.onPlayerErrorChanged(playbackException);
            }

            @Override // androidx.media3.common.Player.Listener
            @Deprecated
            public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
                super.onPlayerStateChanged(z, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
                super.onPlaylistMetadataChanged(mediaMetadata);
            }

            @Override // androidx.media3.common.Player.Listener
            @Deprecated
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
                super.onPositionDiscontinuity(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
                super.onPositionDiscontinuity(positionInfo, positionInfo2, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
                super.onRenderedFirstFrame();
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
                super.onRepeatModeChanged(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
                super.onSeekBackIncrementChanged(j);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
                super.onSeekForwardIncrementChanged(j);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
                super.onShuffleModeEnabledChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
                super.onSkipSilenceEnabledChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
                super.onSurfaceSizeChanged(i, i2);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
                super.onTimelineChanged(timeline, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
                super.onTrackSelectionParametersChanged(trackSelectionParameters);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onTracksChanged(Tracks tracks) {
                super.onTracksChanged(tracks);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
                super.onVideoSizeChanged(videoSize);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
                super.onVolumeChanged(f);
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlaybackStateChanged(int playbackState) {
                if (playbackState == 3) {
                    OptionOnboardingVideoSplashComposable2.OptionOnboardingVideoSplashComposable$lambda$2(snapshotState, true);
                }
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlayerError(PlaybackException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, error, false, null, 4, null);
                OptionOnboardingVideoSplashComposable2.OptionOnboardingVideoSplashComposable$lambda$5(snapshotState2, true);
            }
        };
        exoPlayer.addListener(r0);
        return new DisposableEffectResult() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt$OptionOnboardingVideoSplashComposable$lambda$13$lambda$12$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                exoPlayer.removeListener(r0);
                exoPlayer.stop();
                exoPlayer.release();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult OptionOnboardingVideoSplashComposable$lambda$16$lambda$15(final ComponentActivity componentActivity, final boolean z, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        if (componentActivity != null) {
            SystemBarStyle.Companion companion = SystemBarStyle.INSTANCE;
            EdgeToEdge.enable(componentActivity, companion.dark(-16777216), SystemBarStyle.Companion.auto$default(companion, 0, 0, null, 4, null));
        }
        return new DisposableEffectResult() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt$OptionOnboardingVideoSplashComposable$lambda$16$lambda$15$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                SystemBarStyle systemBarStyleDark;
                ComponentActivity componentActivity2 = componentActivity;
                if (componentActivity2 != null) {
                    if (z) {
                        systemBarStyleDark = SystemBarStyle.INSTANCE.light(0, 0);
                    } else {
                        systemBarStyleDark = SystemBarStyle.INSTANCE.dark(0);
                    }
                    EdgeToEdge.enable$default(componentActivity2, systemBarStyleDark, null, 2, null);
                }
            }
        };
    }

    public static final void VideoContent(final boolean z, final boolean z2, final float f, final ExoPlayer exoPlayer, final String fallbackImageUrl, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        Intrinsics.checkNotNullParameter(fallbackImageUrl, "fallbackImageUrl");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1388412797);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(exoPlayer) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(fallbackImageUrl) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1388412797, i2, -1, "com.robinhood.android.optionsupgrade.VideoContent (OptionOnboardingVideoSplashComposable.kt:257)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierAspectRatio$default = AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f, false, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAspectRatio$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierAlpha = Alpha.alpha(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), z ? 1.0f : 0.0f);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(exoPlayer);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionOnboardingVideoSplashComposable2.VideoContent$lambda$21$lambda$20$lambda$19(exoPlayer, (Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifierAlpha, null, composerStartRestartGroup, 0, 4);
            AnimatedVisibilityKt.AnimatedVisibility(z2, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(1111748321, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt$VideoContent$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1111748321, i3, -1, "com.robinhood.android.optionsupgrade.VideoContent.<anonymous>.<anonymous> (OptionOnboardingVideoSplashComposable.kt:284)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(AspectRatio3.aspectRatio$default(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), f, false, 2, null), Color.INSTANCE.m6725getTransparent0d7_KjU(), null, 2, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    String str = fallbackImageUrl;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    BentoImage.BentoImage(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(str, null, null, ContentScale.INSTANCE.getFillBounds(), 0, null, composer2, 3072, 54), null, SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), null, null, 0.0f, null, composer2, 432, 120);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 3) & 14) | 200064, 18);
            composerStartRestartGroup = composerStartRestartGroup;
            long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
            BoxKt.Box(Background3.background$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.0f, 1, null), C2002Dp.m7995constructorimpl(96)), Brush.Companion.m6683verticalGradient8A3gB4$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(0.35f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(jM21371getBg0d7_KjU, 0.08f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(0.55f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(jM21371getBg0d7_KjU, 0.32f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(0.75f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(jM21371getBg0d7_KjU, 0.62f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(0.9f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(jM21371getBg0d7_KjU, 0.9f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(jM21371getBg0d7_KjU))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingVideoSplashComposable2.VideoContent$lambda$22(z, z2, f, exoPlayer, fallbackImageUrl, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerView VideoContent$lambda$21$lambda$20$lambda$19(ExoPlayer exoPlayer, Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        PlayerView playerView = new PlayerView(ctx);
        playerView.setUseController(false);
        playerView.setResizeMode(3);
        playerView.setShutterBackgroundColor(0);
        playerView.setKeepScreenOn(true);
        playerView.setPlayer(exoPlayer);
        return playerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScrollableContent(final String str, final String str2, Modifier modifier, Composer composer, final int i, final int i2) {
        String str3;
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(967417450);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str3 = str;
        } else {
            str3 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(967417450, i3, -1, "com.robinhood.android.optionsupgrade.ScrollableContent (OptionOnboardingVideoSplashComposable.kt:329)");
                    }
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), C2002Dp.m7995constructorimpl(20), C2002Dp.m7995constructorimpl(16));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    TextStyle displayMartinaLarge = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayMartinaLarge();
                    TextAlign.Companion companion2 = TextAlign.INSTANCE;
                    int iM7919getCentere0LSkKk = companion2.m7919getCentere0LSkKk();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifier5 = modifier4;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(str3, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, displayMartinaLarge, composer2, (i3 & 14) | 48, 0, 8124);
                    BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion3, OptionOnboardingImprovementSplashComposable3.DESCRIPTION_NO_LEARN_MORE_TAG), 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i5).m21596getXxlargeD9Ej5fM(), 5, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer2, (i3 >> 3) & 14, 0, 8120);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingVideoSplashComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionOnboardingVideoSplashComposable2.ScrollableContent$lambda$24(str, str2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            modifier2 = modifier;
            if ((i3 & 147) == 146) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), C2002Dp.m7995constructorimpl(20), C2002Dp.m7995constructorimpl(16));
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    TextStyle displayMartinaLarge2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayMartinaLarge();
                    TextAlign.Companion companion22 = TextAlign.INSTANCE;
                    int iM7919getCentere0LSkKk2 = companion22.m7919getCentere0LSkKk();
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifier52 = modifier4;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(str3, SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), 0, false, 0, 0, null, 0, displayMartinaLarge2, composer2, (i3 & 14) | 48, 0, 8124);
                    BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion32, OptionOnboardingImprovementSplashComposable3.DESCRIPTION_NO_LEARN_MORE_TAG), 0.0f, 1, null), 0.0f, bentoTheme2.getSpacing(composer2, i52).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer2, i52).m21596getXxlargeD9Ej5fM(), 5, null), Color.m6701boximpl(bentoTheme2.getColors(composer2, i52).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion22.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i52).getTextM(), composer2, (i3 >> 3) & 14, 0, 8120);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final ExoPlayer createOptimizedPlayer(Context context) {
        DefaultLoadControl defaultLoadControlBuild = new DefaultLoadControl.Builder().setTargetBufferBytes(-1).setPrioritizeTimeOverSizeThresholds(true).setBufferDurationsMs(1000, 2000, 100, 250).build();
        Intrinsics.checkNotNullExpressionValue(defaultLoadControlBuild, "build(...)");
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).setLoadControl(defaultLoadControlBuild).build();
        Intrinsics.checkNotNullExpressionValue(exoPlayerBuild, "build(...)");
        exoPlayerBuild.setRepeatMode(1);
        exoPlayerBuild.setVideoScalingMode(1);
        exoPlayerBuild.setPlayWhenReady(true);
        return exoPlayerBuild;
    }

    private static final OptionOnboardingVideoSplashComposable rememberFoldMode(Composer composer, int i) {
        FoldingFeature foldingFeature;
        List<DisplayFeature> displayFeatures;
        composer.startReplaceGroup(-2090171432);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2090171432, i, -1, "com.robinhood.android.optionsupgrade.rememberFoldMode (OptionOnboardingVideoSplashComposable.kt:385)");
        }
        Activity activity = (Activity) composer.consume(LocalActivity.getLocalActivity());
        if (activity == null) {
            OptionOnboardingVideoSplashComposable optionOnboardingVideoSplashComposable = OptionOnboardingVideoSplashComposable.SLAB;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return optionOnboardingVideoSplashComposable;
        }
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(activity);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = WindowInfoTracker.INSTANCE.getOrCreate(activity).windowLayoutInfo(activity);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) FlowExtKt.collectAsStateWithLifecycle((Flow<? extends Object>) objRememberedValue, (Object) null, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 48, 14).getValue();
        if (windowLayoutInfo == null || (displayFeatures = windowLayoutInfo.getDisplayFeatures()) == null) {
            foldingFeature = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : displayFeatures) {
                if (obj instanceof FoldingFeature) {
                    arrayList.add(obj);
                }
            }
            foldingFeature = (FoldingFeature) CollectionsKt.firstOrNull((List) arrayList);
        }
        OptionOnboardingVideoSplashComposable optionOnboardingVideoSplashComposable2 = (foldingFeature != null && Intrinsics.areEqual(foldingFeature.getOrientation(), FoldingFeature.Orientation.VERTICAL) && (Intrinsics.areEqual(foldingFeature.getState(), FoldingFeature.State.FLAT) || foldingFeature.isSeparating())) ? OptionOnboardingVideoSplashComposable.UNFOLDED : OptionOnboardingVideoSplashComposable.SLAB;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return optionOnboardingVideoSplashComposable2;
    }
}
