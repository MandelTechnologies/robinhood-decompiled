package com.robinhood.android.eventcontracts.sharedeventui;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.Coil;
import coil.compose.AsyncImagePainter;
import coil.compose.SubcomposeAsyncImage2;
import coil.compose.SubcomposeAsyncImage5;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContractImage.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aK\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\u0001*\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"ContractImage", "", MarkdownText4.TagImageUrl, "", "contentDescription", "fallbackColor", "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "size", "Landroidx/compose/ui/unit/Dp;", "mirrorVertically", "", "ContractImage-MKkPZoM", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/Modifier;FZLandroidx/compose/runtime/Composer;II)V", "ColorFallback", "Lcoil/compose/SubcomposeAsyncImageScope;", ResourceTypes.COLOR, "ColorFallback-RPmYEkk", "(Lcoil/compose/SubcomposeAsyncImageScope;JLandroidx/compose/runtime/Composer;I)V", "Loading", "(Lcoil/compose/SubcomposeAsyncImageScope;Landroidx/compose/runtime/Composer;I)V", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.ContractImageKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ContractImage {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ColorFallback_RPmYEkk$lambda$1(SubcomposeAsyncImage5 subcomposeAsyncImage5, long j, int i, Composer composer, int i2) {
        m14358ColorFallbackRPmYEkk(subcomposeAsyncImage5, j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractImage_MKkPZoM$lambda$0(String str, String str2, Color color, Modifier modifier, float f, boolean z, int i, int i2, Composer composer, int i3) {
        m14359ContractImageMKkPZoM(str, str2, color, modifier, f, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$2(SubcomposeAsyncImage5 subcomposeAsyncImage5, int i, Composer composer, int i2) {
        Loading(subcomposeAsyncImage5, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: ContractImage-MKkPZoM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14359ContractImageMKkPZoM(final String str, final String str2, final Color color, Modifier modifier, float f, boolean z, Composer composer, final int i, final int i2) {
        Object obj;
        int i3;
        String str3;
        Modifier modifier2;
        int i4;
        float f2;
        int i5;
        boolean z2;
        final Modifier modifier3;
        final float fM7995constructorimpl;
        final boolean z3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-821825040);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            obj = str;
        } else {
            obj = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(obj) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str3 = str2;
        } else {
            str3 = str2;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(color) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    f2 = f;
                    i3 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        fM7995constructorimpl = i4 == 0 ? C2002Dp.m7995constructorimpl(40) : f2;
                        z3 = i5 == 0 ? false : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-821825040, i3, -1, "com.robinhood.android.eventcontracts.sharedeventui.ContractImage (ContractImage.kt:30)");
                        }
                        Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(modifier3, fM7995constructorimpl);
                        Modifier modifierMirrorVertically = Modifier.INSTANCE;
                        if (z3) {
                            modifierMirrorVertically = ModifierExt3.mirrorVertically(modifierMirrorVertically);
                        }
                        int i7 = i3;
                        composer2 = composerStartRestartGroup;
                        SubcomposeAsyncImage2.m9122SubcomposeAsyncImageFSyRiR8(obj, str3, Coil.imageLoader((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), modifierM5169size3ABfNKs.then(modifierMirrorVertically), null, null, Alignment.INSTANCE.getCenter(), ContentScale.INSTANCE.getFit(), 0.0f, null, 0, true, null, ComposableLambda3.rememberComposableLambda(1061343955, true, new Function3<SubcomposeAsyncImage5, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.ContractImageKt$ContractImage$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(SubcomposeAsyncImage5 subcomposeAsyncImage5, Composer composer3, Integer num) {
                                invoke(subcomposeAsyncImage5, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(SubcomposeAsyncImage5 SubcomposeAsyncImage, Composer composer3, int i8) {
                                int i9;
                                Intrinsics.checkNotNullParameter(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                if ((i8 & 6) == 0) {
                                    i9 = (composer3.changed(SubcomposeAsyncImage) ? 4 : 2) | i8;
                                } else {
                                    i9 = i8;
                                }
                                if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1061343955, i9, -1, "com.robinhood.android.eventcontracts.sharedeventui.ContractImage.<anonymous> (ContractImage.kt:42)");
                                }
                                AsyncImagePainter.State state = SubcomposeAsyncImage.getPainter().getState();
                                if (state instanceof AsyncImagePainter.State.Error) {
                                    composer3.startReplaceGroup(-1051340847);
                                    if (color == null) {
                                        composer3.startReplaceGroup(-1051300578);
                                        ContractImage.Loading(SubcomposeAsyncImage, composer3, i9 & 14);
                                        composer3.endReplaceGroup();
                                    } else {
                                        composer3.startReplaceGroup(-1051245181);
                                        ContractImage.m14358ColorFallbackRPmYEkk(SubcomposeAsyncImage, color.getValue(), composer3, i9 & 14);
                                        composer3.endReplaceGroup();
                                    }
                                    composer3.endReplaceGroup();
                                } else if (Intrinsics.areEqual(state, AsyncImagePainter.State.Empty.INSTANCE) || (state instanceof AsyncImagePainter.State.Loading)) {
                                    composer3.startReplaceGroup(2044305244);
                                    ContractImage.Loading(SubcomposeAsyncImage, composer3, i9 & 14);
                                    composer3.endReplaceGroup();
                                } else {
                                    if (!(state instanceof AsyncImagePainter.State.Success)) {
                                        composer3.startReplaceGroup(2044293493);
                                        composer3.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer3.startReplaceGroup(2044307216);
                                    SubcomposeAsyncImage2.SubcomposeAsyncImageContent(SubcomposeAsyncImage, null, null, null, null, null, 0.0f, null, false, composer3, i9 & 14, 255);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer2, (i7 & 14) | 14155776 | (i7 & 112), 3120, 5936);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        fM7995constructorimpl = f2;
                        z3 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.ContractImageKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return ContractImage.ContractImage_MKkPZoM$lambda$0(str, str2, color, modifier3, fM7995constructorimpl, z3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                z2 = z;
                if ((74899 & i3) == 74898) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(modifier3, fM7995constructorimpl);
                    Modifier modifierMirrorVertically2 = Modifier.INSTANCE;
                    if (z3) {
                    }
                    int i72 = i3;
                    composer2 = composerStartRestartGroup;
                    SubcomposeAsyncImage2.m9122SubcomposeAsyncImageFSyRiR8(obj, str3, Coil.imageLoader((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), modifierM5169size3ABfNKs2.then(modifierMirrorVertically2), null, null, Alignment.INSTANCE.getCenter(), ContentScale.INSTANCE.getFit(), 0.0f, null, 0, true, null, ComposableLambda3.rememberComposableLambda(1061343955, true, new Function3<SubcomposeAsyncImage5, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.ContractImageKt$ContractImage$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(SubcomposeAsyncImage5 subcomposeAsyncImage5, Composer composer3, Integer num) {
                            invoke(subcomposeAsyncImage5, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(SubcomposeAsyncImage5 SubcomposeAsyncImage, Composer composer3, int i8) {
                            int i9;
                            Intrinsics.checkNotNullParameter(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            if ((i8 & 6) == 0) {
                                i9 = (composer3.changed(SubcomposeAsyncImage) ? 4 : 2) | i8;
                            } else {
                                i9 = i8;
                            }
                            if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1061343955, i9, -1, "com.robinhood.android.eventcontracts.sharedeventui.ContractImage.<anonymous> (ContractImage.kt:42)");
                            }
                            AsyncImagePainter.State state = SubcomposeAsyncImage.getPainter().getState();
                            if (state instanceof AsyncImagePainter.State.Error) {
                                composer3.startReplaceGroup(-1051340847);
                                if (color == null) {
                                    composer3.startReplaceGroup(-1051300578);
                                    ContractImage.Loading(SubcomposeAsyncImage, composer3, i9 & 14);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-1051245181);
                                    ContractImage.m14358ColorFallbackRPmYEkk(SubcomposeAsyncImage, color.getValue(), composer3, i9 & 14);
                                    composer3.endReplaceGroup();
                                }
                                composer3.endReplaceGroup();
                            } else if (Intrinsics.areEqual(state, AsyncImagePainter.State.Empty.INSTANCE) || (state instanceof AsyncImagePainter.State.Loading)) {
                                composer3.startReplaceGroup(2044305244);
                                ContractImage.Loading(SubcomposeAsyncImage, composer3, i9 & 14);
                                composer3.endReplaceGroup();
                            } else {
                                if (!(state instanceof AsyncImagePainter.State.Success)) {
                                    composer3.startReplaceGroup(2044293493);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer3.startReplaceGroup(2044307216);
                                SubcomposeAsyncImage2.SubcomposeAsyncImageContent(SubcomposeAsyncImage, null, null, null, null, null, 0.0f, null, false, composer3, i9 & 14, 255);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, (i72 & 14) | 14155776 | (i72 & 112), 3120, 5936);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f2 = f;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            z2 = z;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f2 = f;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z2 = z;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ColorFallback-RPmYEkk, reason: not valid java name */
    public static final void m14358ColorFallbackRPmYEkk(final SubcomposeAsyncImage5 subcomposeAsyncImage5, long j, Composer composer, final int i) {
        int i2;
        final long j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1980536368);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(subcomposeAsyncImage5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1980536368, i2, -1, "com.robinhood.android.eventcontracts.sharedeventui.ColorFallback (ContractImage.kt:63)");
            }
            j2 = j;
            BoxKt.Box(Background3.m4872backgroundbw27NRU$default(subcomposeAsyncImage5.matchParentSize(Clip.clip(Modifier.INSTANCE, RoundedCornerShape2.getCircleShape())), j2, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            j2 = j;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.ContractImageKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContractImage.ColorFallback_RPmYEkk$lambda$1(subcomposeAsyncImage5, j2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Loading(final SubcomposeAsyncImage5 subcomposeAsyncImage5, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2049173870);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(subcomposeAsyncImage5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2049173870, i2, -1, "com.robinhood.android.eventcontracts.sharedeventui.Loading (ContractImage.kt:73)");
            }
            BoxKt.Box(ModifiersKt.bentoCirclePlaceholder(subcomposeAsyncImage5.matchParentSize(Modifier.INSTANCE), true), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.ContractImageKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContractImage.Loading$lambda$2(subcomposeAsyncImage5, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
