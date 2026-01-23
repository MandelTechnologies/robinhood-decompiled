package com.robinhood.android.acatsin.intro;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Range2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PagedLottie.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0016X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u000eX\u008a\u0084\u0002"}, m3636d2 = {"PagedLottie", "", "modifier", "Landroidx/compose/ui/Modifier;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "pageSpecs", "", "Lcom/robinhood/android/acatsin/intro/LottiePageSpecs;", "pageIndex", "", "animationSpeed", "", "playRemaining", "", "(Landroidx/compose/ui/Modifier;Lcom/airbnb/lottie/LottieComposition;Landroidx/compose/ui/layout/ContentScale;Ljava/util/List;IFZLandroidx/compose/runtime/Composer;II)V", "feature-acats-in_externalDebug", "currentIndex", "prevIndex", "transitionClipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "transitionSpeed", "loopClipSpec", "loopProgress"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.intro.PagedLottieKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class PagedLottie2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PagedLottie$lambda$21(Modifier modifier, LottieComposition lottieComposition, ContentScale contentScale, List list, int i, float f, boolean z, int i2, int i3, Composer composer, int i4) {
        PagedLottie(modifier, lottieComposition, contentScale, list, i, f, z, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PagedLottie(final Modifier modifier, final LottieComposition lottieComposition, final ContentScale contentScale, final List<? extends PagedLottie> pageSpecs, final int i, float f, boolean z, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        float f2;
        int i6;
        boolean z2;
        boolean z3;
        Object objRememberedValue;
        SnapshotIntState2 snapshotIntState2;
        Object objRememberedValue2;
        Composer.Companion companion;
        SnapshotIntState2 snapshotIntState22;
        Object objRememberedValue3;
        SnapshotState snapshotState;
        Object objRememberedValue4;
        SnapshotFloatState2 snapshotFloatState2;
        Object objRememberedValue5;
        SnapshotState snapshotState2;
        boolean z4;
        int i7;
        boolean zChangedInstance;
        SnapshotFloatState2 snapshotFloatState22;
        Object pagedLottie3;
        SnapshotState snapshotState3;
        int i8;
        List<? extends PagedLottie> list;
        float f3;
        SnapshotIntState2 snapshotIntState23;
        LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState;
        boolean zChanged;
        Object pagedLottie4;
        int i9;
        SnapshotState snapshotState4;
        int i10;
        final LottieAnimationState lottieAnimationState;
        boolean z5;
        final SnapshotState snapshotState5;
        final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState2;
        boolean zChanged2;
        Object objRememberedValue6;
        Composer composer2;
        final float f4;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        Intrinsics.checkNotNullParameter(pageSpecs, "pageSpecs");
        Composer composerStartRestartGroup = composer.startRestartGroup(134047707);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(lottieComposition) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(contentScale) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(pageSpecs) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i4 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                if ((196608 & i2) == 0) {
                    f2 = f;
                    i4 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i2 & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                    }
                }
                if ((i4 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    f4 = f2;
                    z6 = z2;
                } else {
                    if (i5 != 0) {
                        f2 = 1.0f;
                    }
                    boolean z7 = i6 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(134047707, i4, -1, "com.robinhood.android.acatsin.intro.PagedLottie (PagedLottie.kt:30)");
                    }
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z3 = (57344 & i4) != 16384;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotIntState3.mutableIntStateOf(RangesKt.coerceIn(i, (Range2<Integer>) CollectionsKt.getIndices(pageSpecs)));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(snapshotIntState2.getIntValue());
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    snapshotIntState22 = (SnapshotIntState2) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(pageSpecs.get(snapshotIntState2.getIntValue()).getInitialClipSpec(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    snapshotState = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotFloatState3.mutableFloatStateOf(f2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotState3.mutableStateOf$default(pageSpecs.get(snapshotIntState2.getIntValue()).getLoopClipSpec(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    Integer numValueOf = Integer.valueOf(snapshotIntState2.getIntValue());
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    z4 = z7;
                    i7 = i4 & 458752;
                    zChangedInstance = (i7 != 131072) | composerStartRestartGroup.changedInstance(pageSpecs) | composerStartRestartGroup.changed(snapshotIntState2);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue7 == companion.getEmpty()) {
                        snapshotFloatState22 = snapshotFloatState2;
                        snapshotState3 = snapshotState;
                        i8 = 1048576;
                        pagedLottie3 = new PagedLottie3(pageSpecs, f2, snapshotIntState2, snapshotIntState22, snapshotState3, snapshotFloatState22, snapshotState2, null);
                        list = pageSpecs;
                        f3 = f2;
                        snapshotIntState23 = snapshotIntState2;
                        composerStartRestartGroup.updateRememberedValue(pagedLottie3);
                    } else {
                        snapshotState3 = snapshotState;
                        snapshotFloatState22 = snapshotFloatState2;
                        f3 = f2;
                        snapshotIntState23 = snapshotIntState2;
                        i8 = 1048576;
                        pagedLottie3 = objRememberedValue7;
                        list = pageSpecs;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) pagedLottie3, composerStartRestartGroup, 0);
                    LottieClipSpec lottieClipSpecPagedLottie$lambda$7 = PagedLottie$lambda$7(snapshotState3);
                    float floatValue = snapshotFloatState22.getFloatValue();
                    int i11 = (i4 >> 3) & 14;
                    int i12 = i11 | 1572864;
                    int i13 = LottieClipSpec.$stable;
                    boolean z8 = false;
                    lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(lottieComposition, false, false, false, lottieClipSpecPagedLottie$lambda$7, floatValue, 1, null, false, false, composerStartRestartGroup, i12 | (i13 << 12), 910);
                    Boolean boolValueOf = Boolean.valueOf(lottieAnimationStateAnimateLottieCompositionAsState.isPlaying());
                    Boolean boolValueOf2 = Boolean.valueOf(z4);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    if ((3670016 & i4) == i8) {
                        z8 = true;
                    }
                    zChanged = z8 | composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState) | composerStartRestartGroup.changed(snapshotIntState23) | composerStartRestartGroup.changedInstance(list);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue8 == companion.getEmpty()) {
                        i9 = i7;
                        snapshotState4 = snapshotState2;
                        i10 = i4;
                        lottieAnimationState = lottieAnimationStateAnimateLottieCompositionAsState;
                        pagedLottie4 = new PagedLottie4(z4, lottieAnimationState, list, snapshotIntState23, null);
                        z5 = z4;
                        composerStartRestartGroup.updateRememberedValue(pagedLottie4);
                    } else {
                        z5 = z4;
                        snapshotState4 = snapshotState2;
                        i10 = i4;
                        lottieAnimationState = lottieAnimationStateAnimateLottieCompositionAsState;
                        pagedLottie4 = objRememberedValue8;
                        i9 = i7;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, boolValueOf2, (Function2) pagedLottie4, composerStartRestartGroup, (i10 >> 15) & 112);
                    snapshotState5 = snapshotState4;
                    float f5 = f3;
                    lottieAnimationStateAnimateLottieCompositionAsState2 = animateLottieCompositionAsState.animateLottieCompositionAsState(lottieComposition, !lottieAnimationState.isPlaying(), false, false, PagedLottie$lambda$13(snapshotState4), f5, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, i12 | (i13 << 12) | i9, 908);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChanged2 = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState2) | composerStartRestartGroup.changed(lottieAnimationState);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: com.robinhood.android.acatsin.intro.PagedLottieKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(PagedLottie2.PagedLottie$lambda$20$lambda$19(lottieAnimationState, lottieAnimationStateAnimateLottieCompositionAsState2, snapshotState5));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    LottieAnimation2.LottieAnimation(lottieComposition, (Function0) objRememberedValue6, modifier, false, false, false, null, false, null, null, contentScale, false, false, null, null, false, composer2, i11 | ((i10 << 6) & 896), (i10 >> 6) & 14, 64504);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = f5;
                    z6 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.intro.PagedLottieKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PagedLottie2.PagedLottie$lambda$21(modifier, lottieComposition, contentScale, pageSpecs, i, f4, z6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 196608;
            f2 = f;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            if ((i4 & 599187) == 599186) {
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((57344 & i4) != 16384) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z3) {
                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(RangesKt.coerceIn(i, (Range2<Integer>) CollectionsKt.getIndices(pageSpecs)));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    snapshotIntState22 = (SnapshotIntState2) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                    }
                    snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    Integer numValueOf2 = Integer.valueOf(snapshotIntState2.getIntValue());
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    z4 = z7;
                    i7 = i4 & 458752;
                    zChangedInstance = (i7 != 131072) | composerStartRestartGroup.changedInstance(pageSpecs) | composerStartRestartGroup.changed(snapshotIntState2);
                    Object objRememberedValue72 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        snapshotFloatState22 = snapshotFloatState2;
                        snapshotState3 = snapshotState;
                        i8 = 1048576;
                        pagedLottie3 = new PagedLottie3(pageSpecs, f2, snapshotIntState2, snapshotIntState22, snapshotState3, snapshotFloatState22, snapshotState2, null);
                        list = pageSpecs;
                        f3 = f2;
                        snapshotIntState23 = snapshotIntState2;
                        composerStartRestartGroup.updateRememberedValue(pagedLottie3);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(numValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) pagedLottie3, composerStartRestartGroup, 0);
                        LottieClipSpec lottieClipSpecPagedLottie$lambda$72 = PagedLottie$lambda$7(snapshotState3);
                        float floatValue2 = snapshotFloatState22.getFloatValue();
                        int i112 = (i4 >> 3) & 14;
                        int i122 = i112 | 1572864;
                        int i132 = LottieClipSpec.$stable;
                        boolean z82 = false;
                        lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(lottieComposition, false, false, false, lottieClipSpecPagedLottie$lambda$72, floatValue2, 1, null, false, false, composerStartRestartGroup, i122 | (i132 << 12), 910);
                        Boolean boolValueOf3 = Boolean.valueOf(lottieAnimationStateAnimateLottieCompositionAsState.isPlaying());
                        Boolean boolValueOf22 = Boolean.valueOf(z4);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        if ((3670016 & i4) == i8) {
                        }
                        zChanged = z82 | composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState) | composerStartRestartGroup.changed(snapshotIntState23) | composerStartRestartGroup.changedInstance(list);
                        Object objRememberedValue82 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            i9 = i7;
                            snapshotState4 = snapshotState2;
                            i10 = i4;
                            lottieAnimationState = lottieAnimationStateAnimateLottieCompositionAsState;
                            pagedLottie4 = new PagedLottie4(z4, lottieAnimationState, list, snapshotIntState23, null);
                            z5 = z4;
                            composerStartRestartGroup.updateRememberedValue(pagedLottie4);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf3, boolValueOf22, (Function2) pagedLottie4, composerStartRestartGroup, (i10 >> 15) & 112);
                            snapshotState5 = snapshotState4;
                            float f52 = f3;
                            lottieAnimationStateAnimateLottieCompositionAsState2 = animateLottieCompositionAsState.animateLottieCompositionAsState(lottieComposition, !lottieAnimationState.isPlaying(), false, false, PagedLottie$lambda$13(snapshotState4), f52, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, i122 | (i132 << 12) | i9, 908);
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            zChanged2 = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState2) | composerStartRestartGroup.changed(lottieAnimationState);
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.acatsin.intro.PagedLottieKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(PagedLottie2.PagedLottie$lambda$20$lambda$19(lottieAnimationState, lottieAnimationStateAnimateLottieCompositionAsState2, snapshotState5));
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                composerStartRestartGroup.endReplaceGroup();
                                composer2 = composerStartRestartGroup;
                                LottieAnimation2.LottieAnimation(lottieComposition, (Function0) objRememberedValue6, modifier, false, false, false, null, false, null, null, contentScale, false, false, null, null, false, composer2, i112 | ((i10 << 6) & 896), (i10 >> 6) & 14, 64504);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f4 = f52;
                                z6 = z5;
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        i5 = i3 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        if ((i4 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float PagedLottie$lambda$20$lambda$19(LottieAnimationState lottieAnimationState, LottieAnimationState lottieAnimationState2, SnapshotState snapshotState) {
        Float fValueOf = Float.valueOf(PagedLottie$lambda$17(lottieAnimationState2));
        if (PagedLottie$lambda$13(snapshotState) == null || lottieAnimationState.isPlaying()) {
            fValueOf = null;
        }
        return fValueOf != null ? fValueOf.floatValue() : lottieAnimationState.getProgress();
    }

    private static final LottieClipSpec PagedLottie$lambda$13(SnapshotState<LottieClipSpec> snapshotState) {
        return snapshotState.getValue();
    }

    private static final float PagedLottie$lambda$17(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    private static final LottieClipSpec PagedLottie$lambda$7(SnapshotState<LottieClipSpec> snapshotState) {
        return snapshotState.getValue();
    }
}
