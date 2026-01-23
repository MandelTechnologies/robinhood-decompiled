package com.truelayer.payments.p419ui.components;

import android.content.Context;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.compose.AsyncImagePainter4;
import coil.request.ImageRequest;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.utils.ImageLoaderHolder;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SvgImage.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ao\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0019\b\u0002\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "url", "description", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "", "Lkotlin/ExtensionFunctionType;", "loading", "errorView", "SvgImage", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/ColorFilter;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lcoil/compose/AsyncImagePainter$State;", "state", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.components.SvgImageKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SvgImage4 {
    /* JADX WARN: Removed duplicated region for block: B:101:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SvgImage(Modifier modifier, final String url, String str, ColorFilter colorFilter, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str2;
        int i4;
        ColorFilter colorFilter2;
        int i5;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function33;
        int i6;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function34;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        AsyncImagePainter.State stateSvgImage$lambda$1;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function35;
        Object obj;
        Modifier modifierAspectRatio$default;
        final Modifier modifier3;
        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function36;
        final String str3;
        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function37;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(url, "url");
        Composer composerStartRestartGroup = composer.startRestartGroup(1912274545);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(url) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 896) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    colorFilter2 = colorFilter;
                    i3 |= composerStartRestartGroup.changed(colorFilter2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((57344 & i) == 0) {
                        function33 = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function33) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        if ((458752 & i) == 0) {
                            function34 = function32;
                            i3 |= composerStartRestartGroup.changedInstance(function34) ? 131072 : 65536;
                        }
                        if ((i3 & 374491) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            String str4 = i8 == 0 ? null : str2;
                            ColorFilter colorFilter3 = i4 == 0 ? null : colorFilter2;
                            Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3M27036getLambda1$payments_ui_release = i5 == 0 ? SvgImage.INSTANCE.m27036getLambda1$payments_ui_release() : function33;
                            Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3M27037getLambda2$payments_ui_release = i6 == 0 ? SvgImage.INSTANCE.m27037getLambda2$payments_ui_release() : function34;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1912274545, i3, -1, "com.truelayer.payments.ui.components.SvgImage (SvgImage.kt:34)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-1827685432);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotState3.mutableStateOf$default(AsyncImagePainter.State.Empty.INSTANCE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            ImageRequest.Builder builderData = new ImageRequest.Builder((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(url);
                            builderData.placeholder(C42830R.drawable.placeholder_icon);
                            EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                            ImageRequest imageRequestBuild = builderData.build();
                            ImageLoader imageLoaderLoader = ImageLoaderHolder.INSTANCE.loader((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), ((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue());
                            composerStartRestartGroup.startReplaceableGroup(-1827685004);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function1<AsyncImagePainter.State, Unit>() { // from class: com.truelayer.payments.ui.components.SvgImageKt$SvgImage$painter$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(AsyncImagePainter.State state) {
                                        invoke2(state);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(AsyncImagePainter.State it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        snapshotState.setValue(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            AsyncImagePainter asyncImagePainterM9107rememberAsyncImagePainter5jETZwI = AsyncImagePainter4.m9107rememberAsyncImagePainter5jETZwI(imageRequestBuild, imageLoaderLoader, null, (Function1) objRememberedValue2, null, 0, composerStartRestartGroup, 3144, 52);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier4);
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            stateSvgImage$lambda$1 = SvgImage$lambda$1(snapshotState);
                            if (!(stateSvgImage$lambda$1 instanceof AsyncImagePainter.State.Empty)) {
                                if (stateSvgImage$lambda$1 instanceof AsyncImagePainter.State.Loading) {
                                    function35 = function3M27036getLambda1$payments_ui_release;
                                } else if (stateSvgImage$lambda$1 instanceof AsyncImagePainter.State.Success) {
                                    function35 = null;
                                } else {
                                    if (!(stateSvgImage$lambda$1 instanceof AsyncImagePainter.State.Error)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    function35 = function3M27037getLambda2$payments_ui_release;
                                }
                                float f = function35 != null ? 0.0f : 1.0f;
                                String str5 = str4;
                                if (!Size.m6579equalsimpl0(asyncImagePainterM9107rememberAsyncImagePainter5jETZwI.mo7005getIntrinsicSizeNHjbRc(), Size.INSTANCE.m6588getUnspecifiedNHjbRc()) && !Float.isNaN(Size.m6583getWidthimpl(asyncImagePainterM9107rememberAsyncImagePainter5jETZwI.mo7005getIntrinsicSizeNHjbRc())) && !Float.isNaN(Size.m6580getHeightimpl(asyncImagePainterM9107rememberAsyncImagePainter5jETZwI.mo7005getIntrinsicSizeNHjbRc()))) {
                                    obj = null;
                                    modifierAspectRatio$default = AspectRatio3.aspectRatio$default(Modifier.INSTANCE, Size.m6583getWidthimpl(asyncImagePainterM9107rememberAsyncImagePainter5jETZwI.mo7005getIntrinsicSizeNHjbRc()) / Size.m6580getHeightimpl(asyncImagePainterM9107rememberAsyncImagePainter5jETZwI.mo7005getIntrinsicSizeNHjbRc()), false, 2, null);
                                } else {
                                    obj = null;
                                    modifierAspectRatio$default = Modifier.INSTANCE;
                                }
                                Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function38 = function35;
                                ColorFilter colorFilter4 = colorFilter3;
                                ImageKt.Image(asyncImagePainterM9107rememberAsyncImagePainter5jETZwI, str5, SizeKt.fillMaxWidth$default(Alpha.alpha(Modifier.INSTANCE, f), 0.0f, 1, obj).then(modifierAspectRatio$default), (Alignment) null, (ContentScale) null, 0.0f, colorFilter4, composerStartRestartGroup, ((i3 >> 3) & 112) | ((i3 << 9) & 3670016), 56);
                                colorFilter2 = colorFilter4;
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.startReplaceableGroup(-1827683577);
                                if (function38 != null) {
                                    function38.invoke(boxScopeInstance, composerStartRestartGroup, 6);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                function36 = function3M27036getLambda1$payments_ui_release;
                                str3 = str5;
                                function37 = function3M27037getLambda2$payments_ui_release;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            str3 = str2;
                            function36 = function33;
                            function37 = function34;
                        }
                        final ColorFilter colorFilter5 = colorFilter2;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.SvgImageKt.SvgImage.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i9) {
                                    SvgImage4.SvgImage(modifier3, url, str3, colorFilter5, function36, function37, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    function34 = function32;
                    if ((i3 & 374491) != 74898) {
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1827685432);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        final SnapshotState<AsyncImagePainter.State> snapshotState2 = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageRequest.Builder builderData2 = new ImageRequest.Builder((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(url);
                        builderData2.placeholder(C42830R.drawable.placeholder_icon);
                        EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                        ImageRequest imageRequestBuild2 = builderData2.build();
                        ImageLoader imageLoaderLoader2 = ImageLoaderHolder.INSTANCE.loader((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), ((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue());
                        composerStartRestartGroup.startReplaceableGroup(-1827685004);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AsyncImagePainter asyncImagePainterM9107rememberAsyncImagePainter5jETZwI2 = AsyncImagePainter4.m9107rememberAsyncImagePainter5jETZwI(imageRequestBuild2, imageLoaderLoader2, null, (Function1) objRememberedValue2, null, 0, composerStartRestartGroup, 3144, 52);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier4);
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            stateSvgImage$lambda$1 = SvgImage$lambda$1(snapshotState2);
                            if (!(stateSvgImage$lambda$1 instanceof AsyncImagePainter.State.Empty)) {
                            }
                        }
                    }
                    final ColorFilter colorFilter52 = colorFilter2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function33 = function3;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                function34 = function32;
                if ((i3 & 374491) != 74898) {
                }
                final ColorFilter colorFilter522 = colorFilter2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            colorFilter2 = colorFilter;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function33 = function3;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            function34 = function32;
            if ((i3 & 374491) != 74898) {
            }
            final ColorFilter colorFilter5222 = colorFilter2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str2 = str;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        colorFilter2 = colorFilter;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function33 = function3;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        function34 = function32;
        if ((i3 & 374491) != 74898) {
        }
        final ColorFilter colorFilter52222 = colorFilter2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final AsyncImagePainter.State SvgImage$lambda$1(SnapshotState<AsyncImagePainter.State> snapshotState) {
        return snapshotState.getValue();
    }
}
