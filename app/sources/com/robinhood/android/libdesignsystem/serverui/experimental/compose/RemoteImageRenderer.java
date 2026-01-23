package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import coil.compose.AsyncImagePainter4;
import coil.request.ImageRequest;
import coil.size.Scale;
import coil.size.Sizes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.experimental.microgram.MicrogramResourceLoader;
import com.robinhood.android.libdesignsystem.serverui.experimental.microgram.MicrogramResourceLoader2;
import com.robinhood.compose.bento.util.CoilUtils2;
import com.robinhood.models.serverdriven.experimental.api.AspectFillRemoteImage;
import com.robinhood.models.serverdriven.experimental.api.AspectFitRemoteImage;
import com.robinhood.models.serverdriven.experimental.api.AspectRatioRemoteImage;
import com.robinhood.models.serverdriven.experimental.api.Size;
import com.robinhood.store.AsyncResult;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RemoteImageRenderer.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a9\u0010\u000f\u001a\u00020\u0010\"\b\b\u0000\u0010\u0011*\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001aC\u0010\u001a\u001a\u00020\u0010\"\b\b\u0000\u0010\u0011*\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00110\u001b2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010\u001e\u001a9\u0010\u001f\u001a\u00020\u0010\"\b\b\u0000\u0010\u0011*\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00110 2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010!\u001aM\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010&\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010(\u001a#\u0010)\u001a\u00020\u0016*\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010\u00012\b\u0010+\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010,\u001a\u001b\u0010-\u001a\u00020\u0016*\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010.\u001a\u001b\u0010/\u001a\u00020\u0016*\u00020\u00162\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010.\u001a\u0012\u00100\u001a\u00020\u0016*\u00020\u00162\u0006\u00101\u001a\u00020\u0018\u001a\u0014\u00102\u001a\u00020\u0016*\u00020\u00162\u0006\u00101\u001a\u00020\u0018H\u0002\u001a\u0014\u00103\u001a\u00020\u0016*\u00020\u00162\u0006\u00101\u001a\u00020\u0018H\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0018\u0010\u000b\u001a\u00020\f*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u00064²\u0006\u0012\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010706X\u008a\u008e\u0002²\u0006\u0012\u00108\u001a\n\u0018\u000109j\u0004\u0018\u0001`:X\u008a\u008e\u0002"}, m3636d2 = {"sanitizedWidth", "", "Lcom/robinhood/models/serverdriven/experimental/api/Size;", "getSanitizedWidth", "(Lcom/robinhood/models/serverdriven/experimental/api/Size;)I", "sanitizedHeight", "getSanitizedHeight", "aspectRatio", "", "getAspectRatio", "(Lcom/robinhood/models/serverdriven/experimental/api/Size;)F", "coilSize", "Lcoil/size/Size;", "getCoilSize", "(Lcom/robinhood/models/serverdriven/experimental/api/Size;Landroidx/compose/runtime/Composer;I)Lcoil/size/Size;", "SduiAspectRatioRemoteImage", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/AspectRatioRemoteImage;", "modifier", "Landroidx/compose/ui/Modifier;", "showDebugBorders", "", "(Lcom/robinhood/models/serverdriven/experimental/api/AspectRatioRemoteImage;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "SduiAspectFillRemoteImage", "Lcom/robinhood/models/serverdriven/experimental/api/AspectFillRemoteImage;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "(Lcom/robinhood/models/serverdriven/experimental/api/AspectFillRemoteImage;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;II)V", "SduiAspectFitRemoteImage", "Lcom/robinhood/models/serverdriven/experimental/api/AspectFitRemoteImage;", "(Lcom/robinhood/models/serverdriven/experimental/api/AspectFitRemoteImage;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "SduiAspectRemoteImage", "url", "", "imageSize", "contentDescription", "imageModifier", "(Ljava/lang/String;Landroidx/compose/ui/layout/ContentScale;Lcom/robinhood/models/serverdriven/experimental/api/Size;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "optionalSize", "width", "height", "(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Ljava/lang/Integer;)Landroidx/compose/ui/Modifier;", "optionalWidth", "(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;)Landroidx/compose/ui/Modifier;", "optionalHeight", "columnBorder", "isVisible", "boxBorder", "imageBorder", "lib-sdui_externalRelease", "microgramResult", "Lcom/robinhood/store/AsyncResult;", "", "imageData", "Ljava/io/Serializable;", "Lcom/squareup/wire/internal/Serializable;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.RemoteImageRendererKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class RemoteImageRenderer {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAspectFillRemoteImage$lambda$3(AspectFillRemoteImage aspectFillRemoteImage, Modifier modifier, boolean z, ContentScale contentScale, int i, int i2, Composer composer, int i3) {
        SduiAspectFillRemoteImage(aspectFillRemoteImage, modifier, z, contentScale, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAspectFitRemoteImage$lambda$5(AspectFitRemoteImage aspectFitRemoteImage, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        SduiAspectFitRemoteImage(aspectFitRemoteImage, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAspectRatioRemoteImage$lambda$1(AspectRatioRemoteImage aspectRatioRemoteImage, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        SduiAspectRatioRemoteImage(aspectRatioRemoteImage, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAspectRemoteImage$lambda$15(String str, ContentScale contentScale, Size size, Modifier modifier, String str2, boolean z, Modifier modifier2, int i, int i2, Composer composer, int i3) {
        SduiAspectRemoteImage(str, contentScale, size, modifier, str2, z, modifier2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final int getSanitizedWidth(Size size) {
        return RangesKt.coerceAtLeast(size.getWidth(), 1);
    }

    private static final int getSanitizedHeight(Size size) {
        return RangesKt.coerceAtLeast(size.getHeight(), 1);
    }

    public static final float getAspectRatio(Size size) {
        Intrinsics.checkNotNullParameter(size, "<this>");
        return getSanitizedWidth(size) / getSanitizedHeight(size);
    }

    @JvmName
    private static final coil.size.Size getCoilSize(Size size, Composer composer, int i) {
        composer.startReplaceGroup(-1350390098);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1350390098, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.<get-coilSize> (RemoteImageRenderer.kt:54)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        coil.size.Size Size = Sizes.Size(density.mo5010roundToPx0680j_4(C2002Dp.m7995constructorimpl(getSanitizedWidth(size))), density.mo5010roundToPx0680j_4(C2002Dp.m7995constructorimpl(getSanitizedHeight(size))));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return Size;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiAspectRatioRemoteImage(final AspectRatioRemoteImage<? extends ActionT> component, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        final boolean z3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-761292921);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z4 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-761292921, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAspectRatioRemoteImage (RemoteImageRenderer.kt:69)");
                    }
                    SduiAspectRemoteImage(component.getUrl(), ContentScale.INSTANCE.getFillWidth(), component.getImage_size(), SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, z4, AspectRatio3.aspectRatio$default(Modifier.INSTANCE, getAspectRatio(component.getImage_size()), false, 2, null), composerStartRestartGroup, ((i3 << 9) & 458752) | 48, 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z4;
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.RemoteImageRendererKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RemoteImageRenderer.SduiAspectRatioRemoteImage$lambda$1(component, modifier3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z2 = z;
            if ((i3 & 147) != 146) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                SduiAspectRemoteImage(component.getUrl(), ContentScale.INSTANCE.getFillWidth(), component.getImage_size(), SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, z4, AspectRatio3.aspectRatio$default(Modifier.INSTANCE, getAspectRatio(component.getImage_size()), false, 2, null), composerStartRestartGroup, ((i3 << 9) & 458752) | 48, 16);
                if (ComposerKt.isTraceInProgress()) {
                }
                z3 = z4;
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i3 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final Serializable SduiAspectRemoteImage$lambda$14$lambda$10(SnapshotState<Serializable> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AsyncResult<byte[]> SduiAspectRemoteImage$lambda$14$lambda$7(SnapshotState<AsyncResult<byte[]>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiAspectFillRemoteImage(final AspectFillRemoteImage<? extends ActionT> component, Modifier modifier, boolean z, ContentScale contentScale, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        ContentScale contentScale2;
        Integer width;
        Modifier modifierFillMaxHeight$default;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        final ContentScale contentScale3;
        final boolean z3;
        Modifier modifierAspectRatio$default;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(1858449338);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
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
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        contentScale2 = contentScale;
                        i3 |= composerStartRestartGroup.changed(contentScale2) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z4 = i4 == 0 ? false : z2;
                        ContentScale crop = i5 == 0 ? ContentScale.INSTANCE.getCrop() : contentScale2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1858449338, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAspectFillRemoteImage (RemoteImageRenderer.kt:89)");
                        }
                        width = component.getWidth();
                        Integer height = component.getHeight();
                        if (width == null && height != null) {
                            if (height.intValue() != 0) {
                                modifierAspectRatio$default = AspectRatio3.aspectRatio$default(Modifier.INSTANCE, width.intValue() / height.intValue(), false, 2, null);
                            } else {
                                modifierAspectRatio$default = Modifier.INSTANCE;
                            }
                            modifierFillMaxHeight$default = SizeKt.fillMaxSize$default(modifierAspectRatio$default, 0.0f, 1, null);
                        } else if (width == null) {
                            modifierFillMaxHeight$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        } else if (height != null) {
                            modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                        } else {
                            modifierFillMaxHeight$default = Modifier.INSTANCE;
                        }
                        Modifier modifierColumnBorder = columnBorder(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), z4);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierColumnBorder);
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
                        SduiAspectRemoteImage(component.getUrl(), crop, component.getImage_size(), optionalSize(modifierFillMaxHeight$default, component.getWidth(), component.getHeight()), null, z4, modifierFillMaxHeight$default, composerStartRestartGroup, ((i3 >> 6) & 112) | ((i3 << 9) & 458752), 16);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        contentScale3 = crop;
                        z3 = z4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        contentScale3 = contentScale2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.RemoteImageRendererKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return RemoteImageRenderer.SduiAspectFillRemoteImage$lambda$3(component, modifier3, z3, contentScale3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                contentScale2 = contentScale;
                if ((i3 & 1171) == 1170) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    width = component.getWidth();
                    Integer height2 = component.getHeight();
                    if (width == null) {
                        if (width == null) {
                        }
                        Modifier modifierColumnBorder2 = columnBorder(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), z4);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierColumnBorder2);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            SduiAspectRemoteImage(component.getUrl(), crop, component.getImage_size(), optionalSize(modifierFillMaxHeight$default, component.getWidth(), component.getHeight()), null, z4, modifierFillMaxHeight$default, composerStartRestartGroup, ((i3 >> 6) & 112) | ((i3 << 9) & 458752), 16);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                            contentScale3 = crop;
                            z3 = z4;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            contentScale2 = contentScale;
            if ((i3 & 1171) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        contentScale2 = contentScale;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiAspectFitRemoteImage(final AspectFitRemoteImage<? extends ActionT> component, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final boolean z3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1109831737);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z4 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1109831737, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAspectFitRemoteImage (RemoteImageRenderer.kt:139)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierColumnBorder = columnBorder(companion, z4);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierColumnBorder);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    SduiAspectRemoteImage(component.getUrl(), ContentScale.INSTANCE.getFit(), component.getImage_size(), optionalSize(modifier4, component.getWidth(), component.getHeight()), null, z4, AspectRatio3.aspectRatio$default(companion, getAspectRatio(component.getImage_size()), false, 2, null), composerStartRestartGroup, ((i3 << 9) & 458752) | 48, 16);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z4;
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.RemoteImageRendererKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RemoteImageRenderer.SduiAspectFitRemoteImage$lambda$5(component, modifier3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z2 = z;
            if ((i3 & 147) == 146) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierColumnBorder2 = columnBorder(companion3, z4);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierColumnBorder2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    SduiAspectRemoteImage(component.getUrl(), ContentScale.INSTANCE.getFit(), component.getImage_size(), optionalSize(modifier4, component.getWidth(), component.getHeight()), null, z4, AspectRatio3.aspectRatio$default(companion3, getAspectRatio(component.getImage_size()), false, 2, null), composerStartRestartGroup, ((i3 << 9) & 458752) | 48, 16);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z4;
                    modifier3 = modifier4;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SduiAspectRemoteImage(final String url, final ContentScale contentScale, final Size imageSize, Modifier modifier, String str, boolean z, final Modifier imageModifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        int i5;
        boolean z2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        int i6;
        SnapshotMutationPolicy snapshotMutationPolicy;
        SnapshotState snapshotState;
        Object objRememberedValue2;
        SnapshotState snapshotState2;
        boolean z3;
        Object objRememberedValue3;
        Object obj;
        final String str3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        Intrinsics.checkNotNullParameter(imageSize, "imageSize");
        Intrinsics.checkNotNullParameter(imageModifier, "imageModifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(758327843);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(url) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(contentScale) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(imageSize) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
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
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(imageModifier) ? 1048576 : 524288;
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            str2 = null;
                        }
                        boolean z4 = i5 == 0 ? false : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(758327843, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAspectRemoteImage (RemoteImageRenderer.kt:171)");
                        }
                        Modifier modifierBoxBorder = boxBorder(modifier4, z4);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierBoxBorder);
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
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue != companion.getEmpty()) {
                            i6 = 2;
                            snapshotMutationPolicy = null;
                            objRememberedValue = SnapshotState3.mutableStateOf$default(AsyncResult.Loading.INSTANCE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            i6 = 2;
                            snapshotMutationPolicy = null;
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i6, snapshotMutationPolicy);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        snapshotState2 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        AsyncResult<byte[]> asyncResultSduiAspectRemoteImage$lambda$14$lambda$7 = SduiAspectRemoteImage$lambda$14$lambda$7(snapshotState);
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        int i8 = i3 & 14;
                        z3 = i8 != 4;
                        int i9 = i3;
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!z3 || objRememberedValue3 == companion.getEmpty()) {
                            obj = null;
                            objRememberedValue3 = new RemoteImageRenderer2(url, snapshotState, snapshotState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(url, asyncResultSduiAspectRemoteImage$lambda$14$lambda$7, (Function2) objRememberedValue3, composerStartRestartGroup, i8);
                        composerStartRestartGroup.startReplaceGroup(931787958);
                        if (StringsKt.startsWith$default(url, "http", false, 2, obj)) {
                            MicrogramResourceLoader microgramResourceLoader = (MicrogramResourceLoader) composerStartRestartGroup.consume(MicrogramResourceLoader2.getLocalMicrogramResourceLoader());
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue4;
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(microgramResourceLoader) | (i8 == 4);
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = new RemoteImageRenderer3(microgramResourceLoader, url, snapshotState, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(coroutineScope, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                        } else {
                            snapshotState.setValue(new AsyncResult.Success(null));
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier5 = modifier4;
                        String str4 = str2;
                        z2 = z4;
                        ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(new ImageRequest.Builder((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(SduiAspectRemoteImage$lambda$14$lambda$10(snapshotState2)).size(getCoilSize(imageSize, composerStartRestartGroup, (i9 >> 6) & 14)).scale(Scale.FILL).build(), CoilUtils2.rememberImageLoader(0.0d, null, composerStartRestartGroup, 0, 3), null, null, null, 0, null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), str4, imageBorder(imageModifier, z4), (Alignment) null, contentScale, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i9 >> 9) & 112) | (57344 & (i9 << 9)), 104);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str3 = str4;
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        str3 = str2;
                    }
                    final boolean z5 = z2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.RemoteImageRendererKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return RemoteImageRenderer.SduiAspectRemoteImage$lambda$15(url, contentScale, imageSize, modifier3, str3, z5, imageModifier, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                z2 = z;
                if ((i2 & 64) == 0) {
                }
                if ((i3 & 599187) == 599186) {
                    if (i7 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierBoxBorder2 = boxBorder(modifier4, z4);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierBoxBorder2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
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
                        AsyncResult<byte[]> asyncResultSduiAspectRemoteImage$lambda$14$lambda$72 = SduiAspectRemoteImage$lambda$14$lambda$7(snapshotState);
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        int i82 = i3 & 14;
                        if (i82 != 4) {
                        }
                        int i92 = i3;
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z3) {
                            obj = null;
                            objRememberedValue3 = new RemoteImageRenderer2(url, snapshotState, snapshotState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(url, asyncResultSduiAspectRemoteImage$lambda$14$lambda$72, (Function2) objRememberedValue3, composerStartRestartGroup, i82);
                            composerStartRestartGroup.startReplaceGroup(931787958);
                            if (StringsKt.startsWith$default(url, "http", false, 2, obj)) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier52 = modifier4;
                            String str42 = str2;
                            z2 = z4;
                            ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(new ImageRequest.Builder((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(SduiAspectRemoteImage$lambda$14$lambda$10(snapshotState2)).size(getCoilSize(imageSize, composerStartRestartGroup, (i92 >> 6) & 14)).scale(Scale.FILL).build(), CoilUtils2.rememberImageLoader(0.0d, null, composerStartRestartGroup, 0, 3), null, null, null, 0, null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), str42, imageBorder(imageModifier, z4), (Alignment) null, contentScale, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i92 >> 9) & 112) | (57344 & (i92 << 9)), 104);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            str3 = str42;
                            modifier3 = modifier52;
                        }
                    }
                }
                final boolean z52 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str2 = str;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            z2 = z;
            if ((i2 & 64) == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            final boolean z522 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        str2 = str;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i2 & 64) == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        final boolean z5222 = z2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final Modifier optionalSize(Modifier modifier, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return optionalHeight(optionalWidth(modifier, num), num2);
    }

    private static final Modifier optionalWidth(Modifier modifier, Integer num) {
        return num != null ? SizeKt.m5174width3ABfNKs(modifier, C2002Dp.m7995constructorimpl(num.intValue())) : modifier;
    }

    private static final Modifier optionalHeight(Modifier modifier, Integer num) {
        return num != null ? SizeKt.m5156height3ABfNKs(modifier, C2002Dp.m7995constructorimpl(num.intValue())) : modifier;
    }

    public static final Modifier columnBorder(Modifier modifier, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return z ? BorderKt.border$default(modifier, new BorderStroke(C2002Dp.m7995constructorimpl(2), new SolidColor(Color.INSTANCE.m6728getYellow0d7_KjU(), null), null), null, 2, null) : modifier;
    }

    private static final Modifier boxBorder(Modifier modifier, boolean z) {
        return z ? BorderKt.border$default(modifier, new BorderStroke(C2002Dp.m7995constructorimpl(2), new SolidColor(Color.INSTANCE.m6723getMagenta0d7_KjU(), null), null), null, 2, null) : modifier;
    }

    private static final Modifier imageBorder(Modifier modifier, boolean z) {
        return z ? BorderKt.border$default(modifier, new BorderStroke(C2002Dp.m7995constructorimpl(2), new SolidColor(Color.INSTANCE.m6718getCyan0d7_KjU(), null), null), null, 2, null) : modifier;
    }
}
