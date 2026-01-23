package com.robinhood.shared.cards.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NotificationEndCardAnimation.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\u001a=\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002"}, m3636d2 = {"NotificationEndCardAnimation", "", "onAnimationEnd", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "tint", "Landroidx/compose/ui/graphics/Color;", "shouldStartAnimation", "", "NotificationEndCardAnimation-drOMvmE", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;ZLandroidx/compose/runtime/Composer;II)V", "lib-cards-compose_externalDebug", "currentIndex", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.cards.compose.NotificationEndCardAnimationKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class NotificationEndCardAnimation {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationEndCardAnimation_drOMvmE$lambda$4(Function0 function0, Modifier modifier, Color color, boolean z, int i, int i2, Composer composer, int i3) {
        m24783NotificationEndCardAnimationdrOMvmE(function0, modifier, color, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0275  */
    /* renamed from: NotificationEndCardAnimation-drOMvmE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m24783NotificationEndCardAnimationdrOMvmE(final Function0<Unit> onAnimationEnd, Modifier modifier, Color color, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Color color2;
        int i5;
        boolean z2;
        List listListOf;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotIntState2 snapshotIntState2;
        boolean z3;
        boolean z4;
        boolean z5;
        SnapshotIntState2 snapshotIntState22;
        int i6;
        final Modifier modifier3;
        final Color color3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        Composer composerStartRestartGroup = composer.startRestartGroup(1164595623);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onAnimationEnd) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    color2 = color;
                    i3 |= composerStartRestartGroup.changed(color2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        Color color4 = i4 == 0 ? null : color2;
                        if (i5 != 0) {
                            z2 = false;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1164595623, i3, -1, "com.robinhood.shared.cards.compose.NotificationEndCardAnimation (NotificationEndCardAnimation.kt:25)");
                        }
                        listListOf = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(C37374R.drawable.cat_1), Integer.valueOf(C37374R.drawable.cat_2), Integer.valueOf(C37374R.drawable.cat_3), Integer.valueOf(C37374R.drawable.cat_4), Integer.valueOf(C37374R.drawable.cat_5), Integer.valueOf(C37374R.drawable.cat_6), Integer.valueOf(C37374R.drawable.cat_7), Integer.valueOf(C37374R.drawable.cat_8), Integer.valueOf(C37374R.drawable.cat_9), Integer.valueOf(C37374R.drawable.cat_10), Integer.valueOf(C37374R.drawable.cat_11), Integer.valueOf(C37374R.drawable.cat_12), Integer.valueOf(C37374R.drawable.cat_13), Integer.valueOf(C37374R.drawable.cat_12), Integer.valueOf(C37374R.drawable.cat_11), Integer.valueOf(C37374R.drawable.cat_10), Integer.valueOf(C37374R.drawable.cat_9), Integer.valueOf(C37374R.drawable.cat_8), Integer.valueOf(C37374R.drawable.cat_7), Integer.valueOf(C37374R.drawable.cat_6), Integer.valueOf(C37374R.drawable.cat_5), Integer.valueOf(C37374R.drawable.cat_4), Integer.valueOf(C37374R.drawable.cat_3), Integer.valueOf(C37374R.drawable.cat_2), Integer.valueOf(C37374R.drawable.cat_1)});
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotIntState3.mutableIntStateOf(-1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        if (snapshotIntState2.getIntValue() < listListOf.size()) {
                            composerStartRestartGroup.startReplaceGroup(-276638862);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C37374R.dimen.card_end_animation_height, composerStartRestartGroup, 0)), composerStartRestartGroup, 0);
                            onAnimationEnd.invoke();
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-276406951);
                            if (snapshotIntState2.getIntValue() < 0) {
                                composerStartRestartGroup.startReplaceGroup(-276401805);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C37374R.dimen.card_end_animation_height, composerStartRestartGroup, 0)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                                z5 = false;
                                snapshotIntState22 = snapshotIntState2;
                                i6 = 2048;
                                z4 = z2;
                                z3 = true;
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-276190664);
                                z3 = true;
                                z4 = z2;
                                z5 = false;
                                snapshotIntState22 = snapshotIntState2;
                                i6 = 2048;
                                ImageKt.Image(PainterResources_androidKt.painterResource(((Number) listListOf.get(snapshotIntState2.getIntValue())).intValue(), composerStartRestartGroup, 0), (String) null, SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(C37374R.dimen.card_end_animation_height, composerStartRestartGroup, 0)), (Alignment) null, (ContentScale) null, 0.0f, color4 != null ? ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, color4.getValue(), 0, 2, null) : null, composerStartRestartGroup, 48, 56);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            Boolean boolValueOf = Boolean.valueOf(z4);
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            if ((i3 & 7168) != i6) {
                                z3 = z5;
                            }
                            boolean zChanged = z3 | composerStartRestartGroup.changed(listListOf);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                z2 = z4;
                                objRememberedValue2 = new NotificationEndCardAnimation2(z2, listListOf, snapshotIntState22, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                z2 = z4;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, (i3 >> 9) & 14);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        color3 = color4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        color3 = color2;
                    }
                    final boolean z6 = z2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.cards.compose.NotificationEndCardAnimationKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return NotificationEndCardAnimation.NotificationEndCardAnimation_drOMvmE$lambda$4(onAnimationEnd, modifier3, color3, z6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                z2 = z;
                if ((i3 & 1171) == 1170) {
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    listListOf = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(C37374R.drawable.cat_1), Integer.valueOf(C37374R.drawable.cat_2), Integer.valueOf(C37374R.drawable.cat_3), Integer.valueOf(C37374R.drawable.cat_4), Integer.valueOf(C37374R.drawable.cat_5), Integer.valueOf(C37374R.drawable.cat_6), Integer.valueOf(C37374R.drawable.cat_7), Integer.valueOf(C37374R.drawable.cat_8), Integer.valueOf(C37374R.drawable.cat_9), Integer.valueOf(C37374R.drawable.cat_10), Integer.valueOf(C37374R.drawable.cat_11), Integer.valueOf(C37374R.drawable.cat_12), Integer.valueOf(C37374R.drawable.cat_13), Integer.valueOf(C37374R.drawable.cat_12), Integer.valueOf(C37374R.drawable.cat_11), Integer.valueOf(C37374R.drawable.cat_10), Integer.valueOf(C37374R.drawable.cat_9), Integer.valueOf(C37374R.drawable.cat_8), Integer.valueOf(C37374R.drawable.cat_7), Integer.valueOf(C37374R.drawable.cat_6), Integer.valueOf(C37374R.drawable.cat_5), Integer.valueOf(C37374R.drawable.cat_4), Integer.valueOf(C37374R.drawable.cat_3), Integer.valueOf(C37374R.drawable.cat_2), Integer.valueOf(C37374R.drawable.cat_1)});
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    if (snapshotIntState2.getIntValue() < listListOf.size()) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    color3 = color4;
                }
                final boolean z62 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            color2 = color;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            z2 = z;
            if ((i3 & 1171) == 1170) {
            }
            final boolean z622 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        color2 = color;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i3 & 1171) == 1170) {
        }
        final boolean z6222 = z2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
