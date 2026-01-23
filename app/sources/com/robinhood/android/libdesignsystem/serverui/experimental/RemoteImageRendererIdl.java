package com.robinhood.android.libdesignsystem.serverui.experimental;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RemoteImageRenderer;
import com.robinhood.models.serverdriven.experimental.api.Size;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ImageDto;

/* compiled from: RemoteImageRendererIdl.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a;\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a1\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"SduiRemoteImage", "", "component", "Lrh_server_driven_ui/v1/ImageDto$SourceDto$RemoteDto;", "contentMode", "Lrh_server_driven_ui/v1/ImageDto$ContentModeDto;", "modifier", "Landroidx/compose/ui/Modifier;", "showDebugBorders", "", "(Lrh_server_driven_ui/v1/ImageDto$SourceDto$RemoteDto;Lrh_server_driven_ui/v1/ImageDto$ContentModeDto;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "SduiAspectFillImage", "sizing", "Lrh_server_driven_ui/v1/ImageDto$SourceDto$RemoteDto$SizeDto;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "(Lrh_server_driven_ui/v1/ImageDto$SourceDto$RemoteDto;Lrh_server_driven_ui/v1/ImageDto$SourceDto$RemoteDto$SizeDto;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;II)V", "SduiAspectFitRemoteImage", "(Lrh_server_driven_ui/v1/ImageDto$SourceDto$RemoteDto;Lrh_server_driven_ui/v1/ImageDto$SourceDto$RemoteDto$SizeDto;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.RemoteImageRendererIdlKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class RemoteImageRendererIdl {

    /* compiled from: RemoteImageRendererIdl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.RemoteImageRendererIdlKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageDto.ContentModeDto.values().length];
            try {
                iArr[ImageDto.ContentModeDto.CONTENT_MODE_ASPECT_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageDto.ContentModeDto.CONTENT_MODE_ASPECT_FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageDto.ContentModeDto.CONTENT_MODE_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAspectFillImage$lambda$2(ImageDto.SourceDto.RemoteDto remoteDto, ImageDto.SourceDto.RemoteDto.SizeDto sizeDto, Modifier modifier, boolean z, ContentScale contentScale, int i, int i2, Composer composer, int i3) {
        SduiAspectFillImage(remoteDto, sizeDto, modifier, z, contentScale, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAspectFitRemoteImage$lambda$4(ImageDto.SourceDto.RemoteDto remoteDto, ImageDto.SourceDto.RemoteDto.SizeDto sizeDto, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        SduiAspectFitRemoteImage(remoteDto, sizeDto, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiRemoteImage$lambda$0(ImageDto.SourceDto.RemoteDto remoteDto, ImageDto.ContentModeDto contentModeDto, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        SduiRemoteImage(remoteDto, contentModeDto, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SduiRemoteImage(final ImageDto.SourceDto.RemoteDto component, final ImageDto.ContentModeDto contentMode, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        Modifier modifier2;
        Composer composer2;
        final boolean z4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(contentMode, "contentMode");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1703439789);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(contentMode.ordinal()) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier;
                if (i6 != 0) {
                    z2 = false;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1703439789, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.SduiRemoteImage (RemoteImageRendererIdl.kt:24)");
                }
                i4 = WhenMappings.$EnumSwitchMapping$0[contentMode.ordinal()];
                if (i4 != 1) {
                    z3 = z2;
                    composerStartRestartGroup.startReplaceGroup(-623088171);
                    ImageDto.SourceDto.RemoteDto.SizeDto size = component.getSize();
                    if (size == null) {
                        size = new ImageDto.SourceDto.RemoteDto.SizeDto(0, 0, 3, null);
                    }
                    int i7 = i3 & 8078;
                    modifier2 = modifier4;
                    SduiAspectFillImage(component, size, modifier2, z3, null, composerStartRestartGroup, i7, 16);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 == 2) {
                    z3 = z2;
                    composerStartRestartGroup.startReplaceGroup(-623078982);
                    ImageDto.SourceDto.RemoteDto.SizeDto size2 = component.getSize();
                    if (size2 == null) {
                        size2 = new ImageDto.SourceDto.RemoteDto.SizeDto(0, 0, 3, null);
                    }
                    Modifier modifier5 = modifier4;
                    int i8 = i3 & 8078;
                    modifier2 = modifier5;
                    SduiAspectFitRemoteImage(component, size2, modifier2, z3, composerStartRestartGroup, i8, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i4 != 3) {
                        composerStartRestartGroup.startReplaceGroup(-623090091);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-623069606);
                    ImageDto.SourceDto.RemoteDto.SizeDto size3 = component.getSize();
                    if (size3 == null) {
                        size3 = new ImageDto.SourceDto.RemoteDto.SizeDto(0, 0, 3, null);
                    }
                    Modifier modifier6 = modifier4;
                    int i9 = i3 & 8078;
                    modifier2 = modifier6;
                    z3 = z2;
                    SduiAspectFitRemoteImage(component, size3, modifier2, z3, composerStartRestartGroup, i9, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2 = composerStartRestartGroup;
                z4 = z3;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                composer2 = composerStartRestartGroup;
                z4 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.RemoteImageRendererIdlKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RemoteImageRendererIdl.SduiRemoteImage$lambda$0(component, contentMode, modifier3, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        z2 = z;
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            i4 = WhenMappings.$EnumSwitchMapping$0[contentMode.ordinal()];
            if (i4 != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            z4 = z3;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SduiAspectFillImage(final ImageDto.SourceDto.RemoteDto component, final ImageDto.SourceDto.RemoteDto.SizeDto sizing, Modifier modifier, boolean z, ContentScale contentScale, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        ContentScale contentScale2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int width;
        Modifier modifierFillMaxHeight$default;
        final Modifier modifier3;
        final ContentScale contentScale3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(sizing, "sizing");
        Composer composerStartRestartGroup = composer.startRestartGroup(158766142);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sizing) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
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
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        contentScale2 = contentScale;
                        i3 |= composerStartRestartGroup.changed(contentScale2) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z4 = i4 == 0 ? false : z2;
                        ContentScale crop = i5 == 0 ? ContentScale.INSTANCE.getCrop() : contentScale2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(158766142, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.SduiAspectFillImage (RemoteImageRendererIdl.kt:56)");
                        }
                        Modifier modifierColumnBorder = RemoteImageRenderer.columnBorder(modifier4, z4);
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
                        ImageDto.SourceDto.RemoteDto.SizeDto size = component.getSize();
                        width = size == null ? size.getWidth() : 0;
                        ImageDto.SourceDto.RemoteDto.SizeDto size2 = component.getSize();
                        int height = size2 == null ? size2.getHeight() : 0;
                        if (width == 0 && height != 0) {
                            modifierFillMaxHeight$default = SizeKt.fillMaxSize$default(AspectRatio3.aspectRatio$default(Modifier.INSTANCE, width / height, false, 2, null), 0.0f, 1, null);
                        } else if (width == 0) {
                            modifierFillMaxHeight$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        } else if (height != 0) {
                            modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                        } else {
                            modifierFillMaxHeight$default = Modifier.INSTANCE;
                        }
                        Modifier modifier5 = modifierFillMaxHeight$default;
                        RemoteImageRenderer.SduiAspectRemoteImage(component.getUrl(), crop, new Size(width, height), RemoteImageRenderer.optionalSize(modifier5, Integer.valueOf(sizing.getWidth()), Integer.valueOf(sizing.getHeight())), null, z4, modifier5, composerStartRestartGroup, ((i3 >> 9) & 112) | ((i3 << 6) & 458752), 16);
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
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.RemoteImageRendererIdlKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return RemoteImageRendererIdl.SduiAspectFillImage$lambda$2(component, sizing, modifier3, z3, contentScale3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                contentScale2 = contentScale;
                if ((i3 & 9363) == 9362) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierColumnBorder2 = RemoteImageRenderer.columnBorder(modifier4, z4);
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
                        ImageDto.SourceDto.RemoteDto.SizeDto size3 = component.getSize();
                        if (size3 == null) {
                        }
                        ImageDto.SourceDto.RemoteDto.SizeDto size22 = component.getSize();
                        if (size22 == null) {
                        }
                        if (width == 0) {
                            if (width == 0) {
                            }
                            Modifier modifier52 = modifierFillMaxHeight$default;
                            RemoteImageRenderer.SduiAspectRemoteImage(component.getUrl(), crop, new Size(width, height), RemoteImageRenderer.optionalSize(modifier52, Integer.valueOf(sizing.getWidth()), Integer.valueOf(sizing.getHeight())), null, z4, modifier52, composerStartRestartGroup, ((i3 >> 9) & 112) | ((i3 << 6) & 458752), 16);
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
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            contentScale2 = contentScale;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        contentScale2 = contentScale;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SduiAspectFitRemoteImage(final ImageDto.SourceDto.RemoteDto component, final ImageDto.SourceDto.RemoteDto.SizeDto sizing, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(sizing, "sizing");
        Composer composerStartRestartGroup = composer.startRestartGroup(1686545373);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sizing) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z4 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1686545373, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.SduiAspectFitRemoteImage (RemoteImageRendererIdl.kt:94)");
                    }
                    Size size = new Size(sizing.getWidth(), sizing.getHeight());
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierColumnBorder = RemoteImageRenderer.columnBorder(companion, z4);
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
                    Modifier modifier5 = modifier4;
                    RemoteImageRenderer.SduiAspectRemoteImage(component.getUrl(), ContentScale.INSTANCE.getFit(), size, RemoteImageRenderer.optionalSize(modifier4, Integer.valueOf(sizing.getWidth()), Integer.valueOf(sizing.getHeight())), null, z4, AspectRatio3.aspectRatio$default(companion, RemoteImageRenderer.getAspectRatio(size), false, 2, null), composerStartRestartGroup, (458752 & (i3 << 6)) | 48, 16);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    z3 = z4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.RemoteImageRendererIdlKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RemoteImageRendererIdl.SduiAspectFitRemoteImage$lambda$4(component, sizing, modifier3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Size size2 = new Size(sizing.getWidth(), sizing.getHeight());
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierColumnBorder2 = RemoteImageRenderer.columnBorder(companion3, z4);
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
                    Modifier modifier52 = modifier4;
                    RemoteImageRenderer.SduiAspectRemoteImage(component.getUrl(), ContentScale.INSTANCE.getFit(), size2, RemoteImageRenderer.optionalSize(modifier4, Integer.valueOf(sizing.getWidth()), Integer.valueOf(sizing.getHeight())), null, z4, AspectRatio3.aspectRatio$default(companion3, RemoteImageRenderer.getAspectRatio(size2), false, 2, null), composerStartRestartGroup, (458752 & (i3 << 6)) | 48, 16);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                    z3 = z4;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
