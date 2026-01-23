package com.robinhood.android.search.highlights.p249ui.common;

import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.search.highlights.model.ProbabilitySegment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ProbabilityBar.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aO\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"ProbabilityBar", "", "probabilitySegments", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/search/highlights/model/ProbabilitySegment;", "modifier", "Landroidx/compose/ui/Modifier;", "barHeight", "Landroidx/compose/ui/unit/Dp;", "roundedClip", "angleWidthDp", "gapWidthDp", "ProbabilityBar-DH4mp8Y", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;FFFFLandroidx/compose/runtime/Composer;II)V", "PreviewProbabilityBar", "(Landroidx/compose/runtime/Composer;I)V", "lib-search-highlights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.common.ProbabilityBarKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ProbabilityBar3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewProbabilityBar$lambda$10(int i, Composer composer, int i2) {
        PreviewProbabilityBar(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProbabilityBar_DH4mp8Y$lambda$0(ImmutableList immutableList, Modifier modifier, float f, float f2, float f3, float f4, int i, int i2, Composer composer, int i3) {
        m18629ProbabilityBarDH4mp8Y(immutableList, modifier, f, f2, f3, f4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProbabilityBar_DH4mp8Y$lambda$9(ImmutableList immutableList, Modifier modifier, float f, float f2, float f3, float f4, int i, int i2, Composer composer, int i3) {
        m18629ProbabilityBarDH4mp8Y(immutableList, modifier, f, f2, f3, f4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    /* renamed from: ProbabilityBar-DH4mp8Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m18629ProbabilityBarDH4mp8Y(final ImmutableList<ProbabilitySegment> probabilitySegments, Modifier modifier, float f, float f2, float f3, float f4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float fM7995constructorimpl;
        int i5;
        float f5;
        int i6;
        float fM7995constructorimpl2;
        int i7;
        float f6;
        final float fM7995constructorimpl3;
        final float fM7995constructorimpl4;
        final float f7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(probabilitySegments, "probabilitySegments");
        Composer composerStartRestartGroup = composer.startRestartGroup(364179249);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(probabilitySegments) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
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
                    fM7995constructorimpl = f;
                    i3 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        f5 = f2;
                        i3 |= composerStartRestartGroup.changed(f5) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            fM7995constructorimpl2 = f3;
                            i3 |= composerStartRestartGroup.changed(fM7995constructorimpl2) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                            f6 = f4;
                        } else {
                            f6 = f4;
                            if ((i & 196608) == 0) {
                                i3 |= composerStartRestartGroup.changed(f6) ? 131072 : 65536;
                            }
                        }
                        if ((i3 & 74899) == 74898 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            fM7995constructorimpl3 = f5;
                            fM7995constructorimpl4 = f6;
                            f7 = fM7995constructorimpl2;
                        } else {
                            if (i8 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                fM7995constructorimpl = C2002Dp.m7995constructorimpl(4);
                            }
                            fM7995constructorimpl3 = i5 == 0 ? C2002Dp.m7995constructorimpl(2) : f5;
                            if (i6 != 0) {
                                fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(5);
                            }
                            fM7995constructorimpl4 = i7 == 0 ? C2002Dp.m7995constructorimpl(4) : f6;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(364179249, i3, -1, "com.robinhood.android.search.highlights.ui.common.ProbabilityBar (ProbabilityBar.kt:36)");
                            }
                            if (!probabilitySegments.isEmpty()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup2 != null) {
                                    final Modifier modifier3 = modifier2;
                                    final float f8 = fM7995constructorimpl;
                                    final float f9 = fM7995constructorimpl2;
                                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.common.ProbabilityBarKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return ProbabilityBar3.ProbabilityBar_DH4mp8Y$lambda$0(probabilitySegments, modifier3, f8, fM7995constructorimpl3, f9, fM7995constructorimpl4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            f7 = fM7995constructorimpl2;
                            final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(probabilitySegments, 10));
                            Iterator<ProbabilitySegment> it = probabilitySegments.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Float.valueOf(it.next().getFraction()));
                            }
                            composerStartRestartGroup.startReplaceGroup(2083919687);
                            final ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(probabilitySegments, 10));
                            Iterator<ProbabilitySegment> it2 = probabilitySegments.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(Color.m6701boximpl(it2.next().getColor().getColor(composerStartRestartGroup, 0)));
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierClip = Clip.clip(SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(modifier2, fM7995constructorimpl), 0.0f, 1, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(fM7995constructorimpl3));
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = ((57344 & i3) == 16384) | ((i3 & 458752) == 131072) | composerStartRestartGroup.changedInstance(arrayList) | composerStartRestartGroup.changedInstance(arrayList2);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.search.highlights.ui.common.ProbabilityBarKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ProbabilityBar3.ProbabilityBar_DH4mp8Y$lambda$8$lambda$7(f7, fM7995constructorimpl4, arrayList, arrayList2, (DrawScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Canvas2.Canvas(modifierClip, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                        final float f10 = fM7995constructorimpl;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.common.ProbabilityBarKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ProbabilityBar3.ProbabilityBar_DH4mp8Y$lambda$9(probabilitySegments, modifier4, f10, fM7995constructorimpl3, f7, fM7995constructorimpl4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    fM7995constructorimpl2 = f3;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    if ((i3 & 74899) == 74898) {
                        if (i8 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (!probabilitySegments.isEmpty()) {
                        }
                    }
                    final float f102 = fM7995constructorimpl;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                f5 = f2;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                fM7995constructorimpl2 = f3;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                if ((i3 & 74899) == 74898) {
                }
                final float f1022 = fM7995constructorimpl;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            fM7995constructorimpl = f;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f5 = f2;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            fM7995constructorimpl2 = f3;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            if ((i3 & 74899) == 74898) {
            }
            final float f10222 = fM7995constructorimpl;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        fM7995constructorimpl = f;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f5 = f2;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        fM7995constructorimpl2 = f3;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        if ((i3 & 74899) == 74898) {
        }
        final float f102222 = fM7995constructorimpl;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProbabilityBar_DH4mp8Y$lambda$8$lambda$7(float f, float f2, List list, List list2, DrawScope drawScope) {
        float f3;
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L));
        float fMo5016toPx0680j_4 = Canvas.mo5016toPx0680j_4(f);
        float fMo5016toPx0680j_42 = Canvas.mo5016toPx0680j_4(f2);
        float f4 = 0.0f;
        float size = fIntBitsToFloat - (list.size() > 1 ? (list.size() - 1) * fMo5016toPx0680j_42 : 0.0f);
        int i = 0;
        float f5 = 0.0f;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue = ((Number) obj).floatValue() * size;
            if (i == 0) {
                float f6 = fFloatValue + f5;
                float f7 = f6 - fMo5016toPx0680j_4;
                Path Path = AndroidPath_androidKt.Path();
                Path.moveTo(f5, f4);
                Path.lineTo(f6, f4);
                Path.lineTo(f7, fIntBitsToFloat2);
                Path.lineTo(f5, fIntBitsToFloat2);
                Path.close();
                DrawScope.m6955drawPathLG529CI$default(Canvas, Path, ((Color) list2.get(i)).getValue(), 0.0f, null, null, 0, 60, null);
                f5 = f7 + fMo5016toPx0680j_42;
                f3 = f4;
            } else if (i == CollectionsKt.getLastIndex(list)) {
                Path Path2 = AndroidPath_androidKt.Path();
                Path2.moveTo(f5 + fMo5016toPx0680j_4, f4);
                Path2.lineTo(fIntBitsToFloat, f4);
                Path2.lineTo(fIntBitsToFloat, fIntBitsToFloat2);
                Path2.lineTo(f5, fIntBitsToFloat2);
                Path2.close();
                DrawScope.m6955drawPathLG529CI$default(drawScope, Path2, ((Color) list2.get(i)).getValue(), 0.0f, null, null, 0, 60, null);
                f5 = f5;
                f3 = 0.0f;
            } else {
                float f8 = f5;
                float f9 = f8 + fMo5016toPx0680j_4;
                float f10 = (fFloatValue + f9) - fMo5016toPx0680j_4;
                float f11 = f10 - fMo5016toPx0680j_4;
                Path Path3 = AndroidPath_androidKt.Path();
                Path3.moveTo(f9, 0.0f);
                Path3.lineTo(f10, 0.0f);
                Path3.lineTo(f11, fIntBitsToFloat2);
                Path3.lineTo(f8, fIntBitsToFloat2);
                Path3.close();
                f3 = 0.0f;
                DrawScope.m6955drawPathLG529CI$default(drawScope, Path3, ((Color) list2.get(i)).getValue(), 0.0f, null, null, 0, 60, null);
                f5 = f11 + fMo5016toPx0680j_42;
            }
            Canvas = drawScope;
            i = i2;
            f4 = f3;
        }
        return Unit.INSTANCE;
    }

    private static final void PreviewProbabilityBar(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1486704606);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1486704606, i, -1, "com.robinhood.android.search.highlights.ui.common.PreviewProbabilityBar (ProbabilityBar.kt:130)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ProbabilityBar.INSTANCE.m18626getLambda$353355414$lib_search_highlights_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.common.ProbabilityBarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProbabilityBar3.PreviewProbabilityBar$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
