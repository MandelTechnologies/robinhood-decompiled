package com.robinhood.android.creditcard.p091ui.waitlist.screens.intro.sections;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.Divider5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.Font2;
import androidx.compose.p011ui.text.font.FontFamily4;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.TextUnit2;
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
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotLongState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
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
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.p014ui.PlayerView;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.ModifiersKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Hero.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0002\u001aY\u0010\r\u001a\u00020\u00062\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a9\u0010\u0015\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0019\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018\"\u0014\u0010\u001d\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018¨\u0006!²\u0006\u000e\u0010\u001e\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lkotlin/Pair;", "Landroidx/media3/exoplayer/source/MediaSource;", "Landroidx/media3/common/MediaItem;", "video", "Lkotlin/Function1;", "", "", "setNav", "Landroidx/compose/ui/Modifier;", "modifier", "", "subtitle", "disclaimer", "Hero", "(Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "terms", "HeroFooter", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "fallback", "onEnd", "VideoPlayer", "(Landroidx/media3/exoplayer/source/MediaSource;Landroidx/media3/common/MediaItem;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "END_IMAGE", "Ljava/lang/String;", "HERO_ROOT_TEST_TAG", "HERO_FOOTER_ROOT_TEST_TAG", "HERO_TITLE_TEST_TAG", "HERO_SUBTITLE_TEST_TAG", "HERO_DISCLAIMER_TEST_TAG", "atEnd", "", "lastPos", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Hero2 {
    private static final String END_IMAGE = "https://cdn.robinhood.com/app_assets/credit-card/gold/card_reveal_final.png";
    public static final String HERO_DISCLAIMER_TEST_TAG = "hero-disclaimer-test-tag";
    public static final String HERO_FOOTER_ROOT_TEST_TAG = "hero-footer-root-test-tag";
    public static final String HERO_ROOT_TEST_TAG = "hero-root-test-tag";
    public static final String HERO_SUBTITLE_TEST_TAG = "hero-subtitle-test-tag";
    public static final String HERO_TITLE_TEST_TAG = "hero-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Hero$lambda$12(Tuples2 tuples2, Function1 function1, Modifier modifier, String str, String str2, int i, int i2, Composer composer, int i3) {
        Hero(tuples2, function1, modifier, str, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeroFooter$lambda$13(Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        HeroFooter(modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoPlayer$lambda$31(MediaSource mediaSource, MediaItem mediaItem, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        VideoPlayer(mediaSource, mediaItem, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Hero(final Tuples2<? extends MediaSource, MediaItem> video, final Function1<? super Boolean, Unit> setNav, Modifier modifier, String str, String str2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        String strStringResource;
        int i4;
        String str3;
        Modifier modifier3;
        int i5;
        String str4;
        String str5;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged;
        Object objRememberedValue2;
        boolean z;
        Object objRememberedValue3;
        Object objRememberedValue4;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        String str6;
        final Modifier modifier4;
        final String str7;
        final String str8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(setNav, "setNav");
        Composer composerStartRestartGroup = composer.startRestartGroup(1357565745);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(video) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(setNav) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    strStringResource = str;
                    int i7 = composerStartRestartGroup.changed(strStringResource) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    strStringResource = str;
                }
                i3 |= i7;
            } else {
                strStringResource = str;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    str3 = str2;
                    i3 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    str8 = strStringResource;
                    str7 = str3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_subtitle, composerStartRestartGroup, 0);
                        }
                        i5 = i3;
                        str4 = strStringResource;
                        str5 = i4 == 0 ? null : str3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        modifier3 = modifier2;
                        str5 = str3;
                        i5 = i3;
                        str4 = strStringResource;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1357565745, i5, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.Hero (Hero.kt:68)");
                    }
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getDisplayMetrics().ydpi);
                    int i8 = i5;
                    Object[] objArr = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Hero2.Hero$lambda$1$lambda$0();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                    Modifier modifierTestTag = TestTag3.testTag(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), fM7995constructorimpl), HERO_ROOT_TEST_TAG);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    MediaSource first = video.getFirst();
                    MediaItem second = video.getSecond();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(snapshotState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Hero2.Hero$lambda$11$lambda$5$lambda$4(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    VideoPlayer(first, second, (Function0) objRememberedValue2, boxScopeInstance.matchParentSize(companion4), composerStartRestartGroup, 0, 0);
                    ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(END_IMAGE, null, null, null, 0, null, composerStartRestartGroup, 6, 62), (String) null, ModifiersKt.isInvisible(boxScopeInstance.matchParentSize(companion4), !Hero$lambda$2(snapshotState)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                    BoxKt.Box(Background3.background$default(boxScopeInstance.matchParentSize(companion4), Brush.Companion.m6683verticalGradient8A3gB4$default(Brush.INSTANCE, new Tuples2[]{new Tuples2(Float.valueOf(0.0f), Color.m6701boximpl(Color2.Color(4278190080L))), new Tuples2(Float.valueOf(0.3333f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4279308304L), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), new Tuples2(Float.valueOf(0.8808f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4288781977L), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), new Tuples2(Float.valueOf(0.9762f), Color.m6701boximpl(Color2.Color(4293912534L)))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
                    Modifier modifierAlign = boxScopeInstance.align(companion4, companion2.getCenter());
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z = (i8 & 112) != 32;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Hero2.Hero$lambda$11$lambda$7$lambda$6(setNav, (LayoutCoordinates) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BoxKt.Box(OnGloballyPositionedModifier3.onGloballyPositioned(modifierAlign, (Function1) objRememberedValue3), composerStartRestartGroup, 0);
                    String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_title, composerStartRestartGroup, 0);
                    int i9 = C12201R.font.itc_garamond_std_book_condensed;
                    FontWeight.Companion companion5 = FontWeight.INSTANCE;
                    TextStyle textStyle = new TextStyle(0L, TextUnit2.getSp(60), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(i9, companion5.getNormal(), 0, 0, 12, null)), (String) null, TextUnit2.getSp(-2), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(48), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
                    BentoColor bentoColor = BentoColor.INSTANCE;
                    long jM21143getCCGoldFG0d7_KjU = bentoColor.m21143getCCGoldFG0d7_KjU();
                    TextAlign.Companion companion6 = TextAlign.INSTANCE;
                    String str9 = str4;
                    BentoText2.m20747BentoText38GnDrw(strStringResource2, TestTag3.testTag(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), HERO_TITLE_TEST_TAG), Color.m6701boximpl(jM21143getCCGoldFG0d7_KjU), null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyle, composerStartRestartGroup, 48, 0, 8120);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i10 = BentoTheme.$stable;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(boxScopeInstance.align(PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), companion2.getBottomCenter()), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Hero2.Hero$lambda$11$lambda$9$lambda$8((DrawScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(DrawModifierKt.drawBehind(modifierFillMaxWidth$default, (Function1) objRememberedValue4), bentoTheme.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor2);
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(str9, TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21591getLargeD9Ej5fM(), 0.0f, 2, null), HERO_SUBTITLE_TEST_TAG), Color.m6701boximpl(bentoColor.m21139getCCGoldBG0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i10).getTextL(), 0L, TextUnit2.getSp(24), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composerStartRestartGroup, (i8 >> 9) & 14, 0, 8120);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(-1574405170);
                    if (str5 == null) {
                        TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i10).getTextS();
                        str6 = str5;
                        BentoText2.m20747BentoText38GnDrw(str6, TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composerStartRestartGroup, i10).m21596getXxlargeD9Ej5fM(), 0.0f, 2, null), HERO_DISCLAIMER_TEST_TAG), Color.m6701boximpl(bentoColor.m21139getCCGoldBG0d7_KjU()), null, companion5.getLight(), null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textS, composerStartRestartGroup, ((i8 >> 12) & 14) | 24576, 0, 8104);
                        composerStartRestartGroup = composerStartRestartGroup;
                    } else {
                        str6 = str5;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    str7 = str6;
                    str8 = str9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Hero2.Hero$lambda$12(video, setNav, modifier4, str8, str7, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            str3 = str2;
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    i5 = i3;
                    str4 = strStringResource;
                    if (i4 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getDisplayMetrics().ydpi);
                    int i82 = i5;
                    Object[] objArr2 = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                    Modifier modifierTestTag2 = TestTag3.testTag(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), fM7995constructorimpl2), HERO_ROOT_TEST_TAG);
                    Alignment.Companion companion22 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag2);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        MediaSource first2 = video.getFirst();
                        MediaItem second2 = video.getSecond();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged = composerStartRestartGroup.changed(snapshotState);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Hero2.Hero$lambda$11$lambda$5$lambda$4(snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier.Companion companion42 = Modifier.INSTANCE;
                            VideoPlayer(first2, second2, (Function0) objRememberedValue2, boxScopeInstance2.matchParentSize(companion42), composerStartRestartGroup, 0, 0);
                            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(END_IMAGE, null, null, null, 0, null, composerStartRestartGroup, 6, 62), (String) null, ModifiersKt.isInvisible(boxScopeInstance2.matchParentSize(companion42), !Hero$lambda$2(snapshotState)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                            BoxKt.Box(Background3.background$default(boxScopeInstance2.matchParentSize(companion42), Brush.Companion.m6683verticalGradient8A3gB4$default(Brush.INSTANCE, new Tuples2[]{new Tuples2(Float.valueOf(0.0f), Color.m6701boximpl(Color2.Color(4278190080L))), new Tuples2(Float.valueOf(0.3333f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4279308304L), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), new Tuples2(Float.valueOf(0.8808f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4288781977L), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), new Tuples2(Float.valueOf(0.9762f), Color.m6701boximpl(Color2.Color(4293912534L)))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
                            Modifier modifierAlign2 = boxScopeInstance2.align(companion42, companion22.getCenter());
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            if ((i82 & 112) != 32) {
                            }
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!z) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Hero2.Hero$lambda$11$lambda$7$lambda$6(setNav, (LayoutCoordinates) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceGroup();
                                BoxKt.Box(OnGloballyPositionedModifier3.onGloballyPositioned(modifierAlign2, (Function1) objRememberedValue3), composerStartRestartGroup, 0);
                                String strStringResource22 = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_title, composerStartRestartGroup, 0);
                                int i92 = C12201R.font.itc_garamond_std_book_condensed;
                                FontWeight.Companion companion52 = FontWeight.INSTANCE;
                                TextStyle textStyle2 = new TextStyle(0L, TextUnit2.getSp(60), companion52.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(i92, companion52.getNormal(), 0, 0, 12, null)), (String) null, TextUnit2.getSp(-2), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, TextUnit2.getSp(48), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
                                BentoColor bentoColor2 = BentoColor.INSTANCE;
                                long jM21143getCCGoldFG0d7_KjU2 = bentoColor2.m21143getCCGoldFG0d7_KjU();
                                TextAlign.Companion companion62 = TextAlign.INSTANCE;
                                String str92 = str4;
                                BentoText2.m20747BentoText38GnDrw(strStringResource22, TestTag3.testTag(SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), HERO_TITLE_TEST_TAG), Color.m6701boximpl(jM21143getCCGoldFG0d7_KjU2), null, null, null, TextAlign.m7912boximpl(companion62.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyle2, composerStartRestartGroup, 48, 0, 8120);
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i102 = BentoTheme.$stable;
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(boxScopeInstance2.align(PaddingKt.m5146paddingqDBjuR0$default(companion42, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i102).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), companion22.getBottomCenter()), 0.0f, 1, null);
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == companion.getEmpty()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(DrawModifierKt.drawBehind(modifierFillMaxWidth$default2, (Function1) objRememberedValue4), bentoTheme2.getSpacing(composerStartRestartGroup, i102).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion22.getCenterHorizontally(), composerStartRestartGroup, 48);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting()) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                    Column6 column62 = Column6.INSTANCE;
                                    BentoText2.m20747BentoText38GnDrw(str92, TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(companion42, bentoTheme2.getSpacing(composerStartRestartGroup, i102).m21591getLargeD9Ej5fM(), 0.0f, 2, null), HERO_SUBTITLE_TEST_TAG), Color.m6701boximpl(bentoColor2.m21139getCCGoldBG0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion62.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composerStartRestartGroup, i102).getTextL(), 0L, TextUnit2.getSp(24), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composerStartRestartGroup, (i82 >> 9) & 14, 0, 8120);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    composerStartRestartGroup.startReplaceGroup(-1574405170);
                                    if (str5 == null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier4 = modifier3;
                                    str7 = str6;
                                    str8 = str92;
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        str3 = str2;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState Hero$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void Hero$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Hero$lambda$11$lambda$5$lambda$4(SnapshotState snapshotState) {
        Hero$lambda$3(snapshotState, true);
        return Unit.INSTANCE;
    }

    private static final boolean Hero$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VideoPlayer$lambda$18(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Hero$lambda$11$lambda$7$lambda$6(Function1 function1, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(Boolean.valueOf(Float.intBitsToFloat((int) (LayoutCoordinates2.positionInWindow(it) & 4294967295L)) <= 0.0f));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Hero$lambda$11$lambda$9$lambda$8(DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        DrawScope.m6957drawRectAsUm42w$default(drawBehind, Brush.Companion.m6683verticalGradient8A3gB4$default(Brush.INSTANCE, new Tuples2[]{new Tuples2(Float.valueOf(0.0f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4291873217L), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), new Tuples2(Float.valueOf(1.0f), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4291873217L), 1.0f, 0.0f, 0.0f, 0.0f, 14, null)))}, 0.0f, 0.0f, 0, 14, (Object) null), 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        return Unit.INSTANCE;
    }

    public static final void HeroFooter(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> terms, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(terms, "terms");
        Composer composerStartRestartGroup = composer.startRestartGroup(1296025008);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(terms) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            final Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1296025008, i3, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroFooter (Hero.kt:180)");
            }
            final TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextAnnotation(), 0L, 0L, null, null, null, null, null, TextUnit2.getSp(1), null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777087, null);
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, BentoColor.INSTANCE.m21139getCCGoldBG0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-349382370, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt.HeroFooter.1
                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-349382370, i5, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroFooter.<anonymous> (Hero.kt:184)");
                    }
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                    Modifier modifierTestTag = TestTag3.testTag(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Background3.m4872backgroundbw27NRU$default(modifier4, BentoColor.INSTANCE.m21142getCCGoldBGLight0d7_KjU(), null, 2, null), 0.0f, 1, null), Hero2.HERO_FOOTER_ROOT_TEST_TAG);
                    Function2<Composer, Integer, Unit> function2 = terms;
                    TextStyle textStyle = textStyleM7655copyp1EtxEg$default;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierTestTag);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    function2.invoke(composer3, 0);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer3, i6).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer3, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    Divider5.m5851HorizontalDivider9IZ8Weo(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composer3, i6).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i6).m21592getMediumD9Ej5fM(), 7, null), 0.0f, bentoTheme.getColors(composer3, i6).m21371getBg0d7_KjU(), composer3, 0, 2);
                    Arrangement.HorizontalOrVertical spaceAround = arrangement.getSpaceAround();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(spaceAround, companion.getTop(), composer3, 6);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer3, 0);
                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer3, companion3);
                    Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                    String strStringResource = StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_material, composer3, 0);
                    FontWeight.Companion companion4 = FontWeight.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, textStyle, composer3, 24576, 0, 8174);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_steel, composer3, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8190);
                    composer3.endNode();
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer3, 0);
                    int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer3, companion3);
                    Function0<ComposeUiNode> constructor5 = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor5);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy4, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion2.getSetModifier());
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_weight, composer3, 0), null, null, null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, textStyle, composer3, 24576, 0, 8174);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.waitlist_intro_grams, composer3, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8190);
                    composer3.endNode();
                    ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C12201R.drawable.svg_visa_signature), null, null, null, 0, null, composer3, 0, 62), (String) null, SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(companion3, C2002Dp.m7995constructorimpl(34)), C2002Dp.m7995constructorimpl(54)), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 25008, 104);
                    composer3.endNode();
                    composer3.endNode();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composer2, 805306368, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Hero2.HeroFooter$lambda$13(modifier3, terms, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VideoPlayer(final MediaSource mediaSource, final MediaItem fallback, final Function0<Unit> onEnd, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Context context;
        Object objRememberedValue;
        Composer.Companion companion;
        final ExoPlayer exoPlayer;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        Object objRememberedValue3;
        final SnapshotLongState2 snapshotLongState2;
        Object objRememberedValue4;
        boolean zChangedInstance;
        Object objRememberedValue5;
        Composer composer2;
        final LifecycleOwner lifecycleOwner;
        boolean zChangedInstance2;
        Object objRememberedValue6;
        final Modifier modifier3;
        Composer composer3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        Composer composerStartRestartGroup = composer.startRestartGroup(600646652);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(mediaSource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(fallback) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEnd) ? 256 : 128;
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
                    ComposerKt.traceEventStart(600646652, i4, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.VideoPlayer (Hero.kt:247)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                Object obj = objRememberedValue;
                if (objRememberedValue == companion.getEmpty()) {
                    ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
                    if (mediaSource != null) {
                        exoPlayerBuild.setMediaSource(mediaSource);
                    } else {
                        exoPlayerBuild.setMediaItem(fallback);
                    }
                    exoPlayerBuild.prepare();
                    exoPlayerBuild.setRepeatMode(0);
                    exoPlayerBuild.setPlayWhenReady(true);
                    exoPlayerBuild.setVideoScalingMode(1);
                    composerStartRestartGroup.updateRememberedValue(exoPlayerBuild);
                    obj = exoPlayerBuild;
                }
                exoPlayer = (ExoPlayer) obj;
                composerStartRestartGroup.endReplaceGroup();
                Intrinsics.checkNotNull(exoPlayer);
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Hero2.VideoPlayer$lambda$17$lambda$16();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                Object[] objArr2 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Hero2.VideoPlayer$lambda$21$lambda$20();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotLongState2 = (SnapshotLongState2) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 6);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Player.Listener() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt$VideoPlayer$listener$1$1
                        @Override // androidx.media3.common.Player.Listener
                        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
                            super.onAudioAttributesChanged(audioAttributes);
                        }

                        @Override // androidx.media3.common.Player.Listener
                        public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i6) {
                            super.onAudioSessionIdChanged(i6);
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
                        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i6, boolean z) {
                            super.onDeviceVolumeChanged(i6, z);
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
                        public /* bridge */ /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i6) {
                            super.onMediaItemTransition(mediaItem, i6);
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
                        public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i6) {
                            super.onPlayWhenReadyChanged(z, i6);
                        }

                        @Override // androidx.media3.common.Player.Listener
                        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                            super.onPlaybackParametersChanged(playbackParameters);
                        }

                        @Override // androidx.media3.common.Player.Listener
                        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i6) {
                            super.onPlaybackSuppressionReasonChanged(i6);
                        }

                        @Override // androidx.media3.common.Player.Listener
                        public /* bridge */ /* synthetic */ void onPlayerError(PlaybackException playbackException) {
                            super.onPlayerError(playbackException);
                        }

                        @Override // androidx.media3.common.Player.Listener
                        public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
                            super.onPlayerErrorChanged(playbackException);
                        }

                        @Override // androidx.media3.common.Player.Listener
                        @Deprecated
                        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i6) {
                            super.onPlayerStateChanged(z, i6);
                        }

                        @Override // androidx.media3.common.Player.Listener
                        public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
                            super.onPlaylistMetadataChanged(mediaMetadata);
                        }

                        @Override // androidx.media3.common.Player.Listener
                        @Deprecated
                        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i6) {
                            super.onPositionDiscontinuity(i6);
                        }

                        @Override // androidx.media3.common.Player.Listener
                        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i6) {
                            super.onPositionDiscontinuity(positionInfo, positionInfo2, i6);
                        }

                        @Override // androidx.media3.common.Player.Listener
                        public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
                            super.onRenderedFirstFrame();
                        }

                        @Override // androidx.media3.common.Player.Listener
                        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i6) {
                            super.onRepeatModeChanged(i6);
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
                        public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i6, int i7) {
                            super.onSurfaceSizeChanged(i6, i7);
                        }

                        @Override // androidx.media3.common.Player.Listener
                        public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, int i6) {
                            super.onTimelineChanged(timeline, i6);
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
                            super.onPlaybackStateChanged(playbackState);
                            if (playbackState == 4) {
                                Hero2.VideoPlayer$lambda$19(snapshotState, true);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                exoPlayer.addListener((Hero4) objRememberedValue4);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(exoPlayer);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Hero2.VideoPlayer$lambda$27$lambda$26(context, exoPlayer, (Context) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue5, modifier5, null, composerStartRestartGroup, (i4 >> 6) & 112, 4);
                composer2 = composerStartRestartGroup;
                lifecycleOwner = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Unit unit = Unit.INSTANCE;
                composer2.startReplaceGroup(-1224400529);
                zChangedInstance2 = composer2.changedInstance(exoPlayer) | composer2.changed(snapshotLongState2) | composer2.changed(snapshotState) | ((i4 & 896) != 256) | composer2.changedInstance(lifecycleOwner);
                objRememberedValue6 = composer2.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Hero2.VideoPlayer$lambda$30$lambda$29(lifecycleOwner, exoPlayer, onEnd, snapshotLongState2, snapshotState, (DisposableEffectScope) obj2);
                        }
                    };
                    composer2.updateRememberedValue(function1);
                    objRememberedValue6 = function1;
                }
                composer2.endReplaceGroup();
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
                composer3 = composer2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return Hero2.VideoPlayer$lambda$31(mediaSource, fallback, onEnd, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
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
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            Object obj2 = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
            }
            exoPlayer = (ExoPlayer) obj2;
            composerStartRestartGroup.endReplaceGroup();
            Intrinsics.checkNotNull(exoPlayer);
            Object[] objArr3 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
            Object[] objArr22 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            snapshotLongState2 = (SnapshotLongState2) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            exoPlayer.addListener((Hero4) objRememberedValue4);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(exoPlayer);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj22) {
                        return Hero2.VideoPlayer$lambda$27$lambda$26(context, exoPlayer, (Context) obj22);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue5, modifier52, null, composerStartRestartGroup, (i4 >> 6) & 112, 4);
                composer2 = composerStartRestartGroup;
                lifecycleOwner = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Unit unit2 = Unit.INSTANCE;
                composer2.startReplaceGroup(-1224400529);
                zChangedInstance2 = composer2.changedInstance(exoPlayer) | composer2.changed(snapshotLongState2) | composer2.changed(snapshotState) | ((i4 & 896) != 256) | composer2.changedInstance(lifecycleOwner);
                objRememberedValue6 = composer2.rememberedValue();
                if (!zChangedInstance2) {
                    Function1 function12 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj22) {
                            return Hero2.VideoPlayer$lambda$30$lambda$29(lifecycleOwner, exoPlayer, onEnd, snapshotLongState2, snapshotState, (DisposableEffectScope) obj22);
                        }
                    };
                    composer2.updateRememberedValue(function12);
                    objRememberedValue6 = function12;
                    composer2.endReplaceGroup();
                    EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                    composer3 = composer2;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState VideoPlayer$lambda$17$lambda$16() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VideoPlayer$lambda$19(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotLongState2 VideoPlayer$lambda$21$lambda$20() {
        return SnapshotLongState3.mutableLongStateOf(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerView VideoPlayer$lambda$27$lambda$26(Context context, ExoPlayer exoPlayer, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PlayerView playerView = new PlayerView(context);
        playerView.hideController();
        playerView.setUseController(false);
        playerView.setResizeMode(4);
        playerView.setShutterBackgroundColor(0);
        playerView.setPlayer(exoPlayer);
        return playerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult VideoPlayer$lambda$30$lambda$29(final LifecycleOwner lifecycleOwner, final ExoPlayer exoPlayer, final Function0 function0, final SnapshotLongState2 snapshotLongState2, final SnapshotState snapshotState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt$VideoPlayer$2$1$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_STOP) {
                    exoPlayer.pause();
                    snapshotLongState2.setLongValue(exoPlayer.getCurrentPosition());
                    if (Hero2.VideoPlayer$lambda$18(snapshotState)) {
                        function0.invoke();
                        return;
                    }
                    return;
                }
                if (event == Lifecycle.Event.ON_START) {
                    exoPlayer.seekTo(snapshotLongState2.getLongValue());
                    exoPlayer.play();
                }
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.intro.sections.HeroKt$VideoPlayer$lambda$30$lambda$29$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                exoPlayer.stop();
                exoPlayer.setPlayWhenReady(false);
                exoPlayer.release();
            }
        };
    }
}
