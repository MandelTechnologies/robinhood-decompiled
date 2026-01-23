package coil.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.SizeResolver;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SubcomposeAsyncImage.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÇ\u0001\u0010 \u001a\u00020\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a£\u0001\u0010 \u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0002\b\u001cH\u0003ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001ag\u0010'\u001a\u00020\u000b*\u00020\u001b2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010&\u001a\u00020%2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, m3636d2 = {"", "model", "", "contentDescription", "Lcoil/ImageLoader;", "imageLoader", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "transform", "", "onState", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "", "clipToBounds", "Lcoil/compose/EqualityDelegate;", "modelEqualityDelegate", "Lcoil/compose/SubcomposeAsyncImageScope;", "Lkotlin/ExtensionFunctionType;", "content", "SubcomposeAsyncImage-FSyRiR8", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLcoil/compose/EqualityDelegate;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SubcomposeAsyncImage", "Lcoil/compose/AsyncImageState;", "state", "SubcomposeAsyncImage-gl8XCv8", "(Lcoil/compose/AsyncImageState;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/graphics/painter/Painter;", PlaceTypes.PAINTER, "SubcomposeAsyncImageContent", "(Lcoil/compose/SubcomposeAsyncImageScope;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ZLandroidx/compose/runtime/Composer;II)V", "coil-compose-base_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: coil.compose.SubcomposeAsyncImageKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class SubcomposeAsyncImage2 {
    /* renamed from: SubcomposeAsyncImage-FSyRiR8, reason: not valid java name */
    public static final void m9122SubcomposeAsyncImageFSyRiR8(Object obj, String str, ImageLoader imageLoader, Modifier modifier, Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, Function1<? super AsyncImagePainter.State, Unit> function12, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, boolean z, EqualityDelegate equalityDelegate, Function3<? super SubcomposeAsyncImage5, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3, int i4) {
        composer.startReplaceableGroup(-2125038415);
        Modifier modifier2 = (i4 & 8) != 0 ? Modifier.INSTANCE : modifier;
        Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> defaultTransform = (i4 & 16) != 0 ? AsyncImagePainter.INSTANCE.getDefaultTransform() : function1;
        Function1<? super AsyncImagePainter.State, Unit> function13 = (i4 & 32) != 0 ? null : function12;
        Alignment center = (i4 & 64) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i4 & 128) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i4 & 256) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i4 & 512) != 0 ? null : colorFilter;
        int iM6965getDefaultFilterQualityfv9h1I = (i4 & 1024) != 0 ? DrawScope.INSTANCE.m6965getDefaultFilterQualityfv9h1I() : i;
        boolean z2 = (i4 & 2048) != 0 ? true : z;
        EqualityDelegate defaultModelEqualityDelegate = (i4 & 4096) != 0 ? EqualityDelegate2.getDefaultModelEqualityDelegate() : equalityDelegate;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2125038415, i2, i3, "coil.compose.SubcomposeAsyncImage (SubcomposeAsyncImage.kt:168)");
        }
        int i5 = i2 >> 3;
        m9123SubcomposeAsyncImagegl8XCv8(new AsyncImageState(obj, defaultModelEqualityDelegate, imageLoader), str, modifier2, defaultTransform, function13, center, fit, f2, colorFilter2, iM6965getDefaultFilterQualityfv9h1I, z2, function3, composer, (i5 & 234881024) | (i2 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | ((i3 << 27) & 1879048192), ((i3 >> 3) & 14) | ((i3 >> 6) & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* renamed from: SubcomposeAsyncImage-gl8XCv8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9123SubcomposeAsyncImagegl8XCv8(AsyncImageState asyncImageState, final String str, Modifier modifier, final Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, final Function1<? super AsyncImagePainter.State, Unit> function12, final Alignment alignment, final ContentScale contentScale, final float f, final ColorFilter colorFilter, final int i, final boolean z, final Function3<? super SubcomposeAsyncImage5, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3, final int i4) {
        AsyncImageState asyncImageState2;
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        final SizeResolver sizeResolver;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i8;
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(-892827826);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
            asyncImageState2 = asyncImageState;
        } else {
            asyncImageState2 = asyncImageState;
            if ((i2 & 14) == 0) {
                i5 = (composerStartRestartGroup.changed(asyncImageState2) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                i5 |= composerStartRestartGroup.changed(str) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i2 & 896) == 0) {
                    modifier2 = modifier;
                    i5 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i4 & 8) != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 7168) == 0) {
                        i5 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
                    }
                    if ((i4 & 16) == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 57344) == 0) {
                        i5 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
                    }
                    if ((i4 & 32) != 0) {
                        i9 = (i2 & 458752) == 0 ? composerStartRestartGroup.changed(alignment) ? 131072 : 65536 : 196608;
                        if ((i4 & 64) == 0) {
                            i8 = (i2 & 3670016) == 0 ? composerStartRestartGroup.changed(contentScale) ? 1048576 : 524288 : 1572864;
                            if ((i4 & 128) == 0) {
                                i5 |= 12582912;
                            } else {
                                if ((29360128 & i2) == 0) {
                                    i5 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
                                }
                                if ((i4 & 256) != 0) {
                                    i5 |= 100663296;
                                } else {
                                    if ((234881024 & i2) == 0) {
                                        i5 |= composerStartRestartGroup.changed(colorFilter) ? 67108864 : 33554432;
                                    }
                                    if ((i4 & 512) != 0) {
                                        if ((1879048192 & i2) == 0) {
                                            i5 |= composerStartRestartGroup.changed(i) ? 536870912 : 268435456;
                                        }
                                        if ((i4 & 1024) != 0) {
                                            i7 = i3 | 6;
                                        } else if ((i3 & 14) == 0) {
                                            i7 = i3 | (composerStartRestartGroup.changed(z) ? 4 : 2);
                                        } else {
                                            i7 = i3;
                                        }
                                        if ((i4 & 2048) != 0) {
                                            i7 |= 48;
                                        } else if ((i3 & 112) == 0) {
                                            i7 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
                                        }
                                        int i10 = i7;
                                        if ((i5 & 1533916891) != 306783378 || (i10 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
                                            Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-892827826, i5, i10, "coil.compose.SubcomposeAsyncImage (SubcomposeAsyncImage.kt:228)");
                                            }
                                            ImageRequest imageRequestRequestOfWithSizeResolver = UtilsKt.requestOfWithSizeResolver(asyncImageState2.getModel(), contentScale, composerStartRestartGroup, ((i5 >> 15) & 112) | 8);
                                            int i11 = i5;
                                            int i12 = i11 >> 3;
                                            int i13 = i11 >> 6;
                                            int i14 = i11 >> 12;
                                            final AsyncImagePainter asyncImagePainterM9105rememberAsyncImagePainter0YpotYA = AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(imageRequestRequestOfWithSizeResolver, asyncImageState2.getImageLoader(), function1, function12, contentScale, i, null, composerStartRestartGroup, (i12 & 7168) | (i12 & 896) | 72 | (i13 & 57344) | (i14 & 458752), 64);
                                            sizeResolver = imageRequestRequestOfWithSizeResolver.getSizeResolver();
                                            if (sizeResolver instanceof ConstraintsSizeResolver) {
                                                composerStartRestartGroup.startReplaceableGroup(-247974462);
                                                composerStartRestartGroup.startReplaceableGroup(733328855);
                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(alignment, true, composerStartRestartGroup, (((((i13 & 14) | 384) | (i14 & 112)) >> 3) & 14) | 48);
                                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier5);
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
                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                                function3.invoke(new RealSubcomposeAsyncImageScope(BoxScopeInstance.INSTANCE, asyncImagePainterM9105rememberAsyncImagePainter0YpotYA, str, alignment, contentScale, f, colorFilter, z), composerStartRestartGroup, Integer.valueOf(i10 & 112));
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endNode();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup = composerStartRestartGroup;
                                                modifier3 = modifier5;
                                            } else {
                                                composerStartRestartGroup.startReplaceableGroup(-247973763);
                                                composerStartRestartGroup = composerStartRestartGroup;
                                                modifier3 = modifier5;
                                                BoxWithConstraints.BoxWithConstraints(modifier3, alignment, true, ComposableLambda3.composableLambda(composerStartRestartGroup, 748478484, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: coil.compose.SubcomposeAsyncImageKt$SubcomposeAsyncImage$2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                                                        invoke(boxWithConstraints4, composer2, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, int i15) {
                                                        if ((i15 & 14) == 0) {
                                                            i15 |= composer2.changed(boxWithConstraints4) ? 4 : 2;
                                                        }
                                                        if ((i15 & 91) != 18 || !composer2.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(748478484, i15, -1, "coil.compose.SubcomposeAsyncImage.<anonymous> (SubcomposeAsyncImage.kt:274)");
                                                            }
                                                            ((ConstraintsSizeResolver) sizeResolver).m9110setConstraintsBRTryo0(boxWithConstraints4.getConstraints());
                                                            function3.invoke(new RealSubcomposeAsyncImageScope(boxWithConstraints4, asyncImagePainterM9105rememberAsyncImagePainter0YpotYA, str, alignment, contentScale, f, colorFilter, z), composer2, 0);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer2.skipToGroupEnd();
                                                    }
                                                }), composerStartRestartGroup, (i13 & 14) | 3456 | (i14 & 112), 0);
                                                composerStartRestartGroup.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            modifier4 = modifier3;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            modifier4 = modifier2;
                                        }
                                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup != null) {
                                            final AsyncImageState asyncImageState3 = asyncImageState2;
                                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: coil.compose.SubcomposeAsyncImageKt$SubcomposeAsyncImage$3
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

                                                public final void invoke(Composer composer2, int i15) {
                                                    SubcomposeAsyncImage2.m9123SubcomposeAsyncImagegl8XCv8(asyncImageState3, str, modifier4, function1, function12, alignment, contentScale, f, colorFilter, i, z, function3, composer2, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i5 |= 805306368;
                                    if ((i4 & 1024) != 0) {
                                    }
                                    if ((i4 & 2048) != 0) {
                                    }
                                    int i102 = i7;
                                    if ((i5 & 1533916891) != 306783378) {
                                        if (i6 == 0) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        ImageRequest imageRequestRequestOfWithSizeResolver2 = UtilsKt.requestOfWithSizeResolver(asyncImageState2.getModel(), contentScale, composerStartRestartGroup, ((i5 >> 15) & 112) | 8);
                                        int i112 = i5;
                                        int i122 = i112 >> 3;
                                        int i132 = i112 >> 6;
                                        int i142 = i112 >> 12;
                                        final AsyncImagePainter asyncImagePainterM9105rememberAsyncImagePainter0YpotYA2 = AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(imageRequestRequestOfWithSizeResolver2, asyncImageState2.getImageLoader(), function1, function12, contentScale, i, null, composerStartRestartGroup, (i122 & 7168) | (i122 & 896) | 72 | (i132 & 57344) | (i142 & 458752), 64);
                                        sizeResolver = imageRequestRequestOfWithSizeResolver2.getSizeResolver();
                                        if (sizeResolver instanceof ConstraintsSizeResolver) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier4 = modifier3;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                    }
                                }
                                if ((i4 & 512) != 0) {
                                }
                                if ((i4 & 1024) != 0) {
                                }
                                if ((i4 & 2048) != 0) {
                                }
                                int i1022 = i7;
                                if ((i5 & 1533916891) != 306783378) {
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                }
                            }
                            if ((i4 & 256) != 0) {
                            }
                            if ((i4 & 512) != 0) {
                            }
                            if ((i4 & 1024) != 0) {
                            }
                            if ((i4 & 2048) != 0) {
                            }
                            int i10222 = i7;
                            if ((i5 & 1533916891) != 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i5 |= i8;
                        if ((i4 & 128) == 0) {
                        }
                        if ((i4 & 256) != 0) {
                        }
                        if ((i4 & 512) != 0) {
                        }
                        if ((i4 & 1024) != 0) {
                        }
                        if ((i4 & 2048) != 0) {
                        }
                        int i102222 = i7;
                        if ((i5 & 1533916891) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i5 |= i9;
                    if ((i4 & 64) == 0) {
                    }
                    i5 |= i8;
                    if ((i4 & 128) == 0) {
                    }
                    if ((i4 & 256) != 0) {
                    }
                    if ((i4 & 512) != 0) {
                    }
                    if ((i4 & 1024) != 0) {
                    }
                    if ((i4 & 2048) != 0) {
                    }
                    int i1022222 = i7;
                    if ((i5 & 1533916891) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i4 & 16) == 0) {
                }
                if ((i4 & 32) != 0) {
                }
                i5 |= i9;
                if ((i4 & 64) == 0) {
                }
                i5 |= i8;
                if ((i4 & 128) == 0) {
                }
                if ((i4 & 256) != 0) {
                }
                if ((i4 & 512) != 0) {
                }
                if ((i4 & 1024) != 0) {
                }
                if ((i4 & 2048) != 0) {
                }
                int i10222222 = i7;
                if ((i5 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            if ((i4 & 8) != 0) {
            }
            if ((i4 & 16) == 0) {
            }
            if ((i4 & 32) != 0) {
            }
            i5 |= i9;
            if ((i4 & 64) == 0) {
            }
            i5 |= i8;
            if ((i4 & 128) == 0) {
            }
            if ((i4 & 256) != 0) {
            }
            if ((i4 & 512) != 0) {
            }
            if ((i4 & 1024) != 0) {
            }
            if ((i4 & 2048) != 0) {
            }
            int i102222222 = i7;
            if ((i5 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        if ((i4 & 8) != 0) {
        }
        if ((i4 & 16) == 0) {
        }
        if ((i4 & 32) != 0) {
        }
        i5 |= i9;
        if ((i4 & 64) == 0) {
        }
        i5 |= i8;
        if ((i4 & 128) == 0) {
        }
        if ((i4 & 256) != 0) {
        }
        if ((i4 & 512) != 0) {
        }
        if ((i4 & 1024) != 0) {
        }
        if ((i4 & 2048) != 0) {
        }
        int i1022222222 = i7;
        if ((i5 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SubcomposeAsyncImageContent(final SubcomposeAsyncImage5 subcomposeAsyncImage5, Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, boolean z, Composer composer, final int i, final int i2) {
        SubcomposeAsyncImage5 subcomposeAsyncImage52;
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        Alignment alignment2;
        ContentScale contentScale2;
        float f2;
        ColorFilter colorFilter2;
        boolean clipToBounds;
        Painter painter2;
        String contentDescription;
        Alignment alignment3;
        ContentScale contentScale3;
        float alpha;
        ColorFilter colorFilter3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final String str3;
        final Modifier modifier3;
        final Alignment alignment4;
        final ContentScale contentScale4;
        final float f3;
        final ColorFilter colorFilter4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(880638523);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
            subcomposeAsyncImage52 = subcomposeAsyncImage5;
        } else if ((i & 14) == 0) {
            subcomposeAsyncImage52 = subcomposeAsyncImage5;
            i3 = (composerStartRestartGroup.changed(subcomposeAsyncImage52) ? 4 : 2) | i;
        } else {
            subcomposeAsyncImage52 = subcomposeAsyncImage5;
            i3 = i;
        }
        int i5 = i2 & 1;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 2;
            if (i4 != 0) {
                i3 |= 128;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 4) == 0) {
                    str2 = str;
                    int i6 = composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    str2 = str;
                }
                i3 |= i6;
            } else {
                str2 = str;
            }
            if ((57344 & i) != 0) {
                if ((i2 & 8) == 0) {
                    alignment2 = alignment;
                    int i7 = composerStartRestartGroup.changed(alignment2) ? 16384 : 8192;
                    i3 |= i7;
                } else {
                    alignment2 = alignment;
                }
                i3 |= i7;
            } else {
                alignment2 = alignment;
            }
            if ((458752 & i) != 0) {
                if ((i2 & 16) == 0) {
                    contentScale2 = contentScale;
                    int i8 = composerStartRestartGroup.changed(contentScale2) ? 131072 : 65536;
                    i3 |= i8;
                } else {
                    contentScale2 = contentScale;
                }
                i3 |= i8;
            } else {
                contentScale2 = contentScale;
            }
            if ((3670016 & i) != 0) {
                if ((i2 & 32) == 0) {
                    f2 = f;
                    int i9 = composerStartRestartGroup.changed(f2) ? 1048576 : 524288;
                    i3 |= i9;
                } else {
                    f2 = f;
                }
                i3 |= i9;
            } else {
                f2 = f;
            }
            if ((29360128 & i) != 0) {
                if ((i2 & 64) == 0) {
                    colorFilter2 = colorFilter;
                    int i10 = composerStartRestartGroup.changed(colorFilter2) ? 8388608 : 4194304;
                    i3 |= i10;
                } else {
                    colorFilter2 = colorFilter;
                }
                i3 |= i10;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((234881024 & i) != 0) {
                if ((i2 & 128) == 0) {
                    clipToBounds = z;
                    int i11 = composerStartRestartGroup.changed(clipToBounds) ? 67108864 : 33554432;
                    i3 |= i11;
                } else {
                    clipToBounds = z;
                }
                i3 |= i11;
            } else {
                clipToBounds = z;
            }
            if (i4 != 2 && (191739611 & i3) == 38347922 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                str3 = str2;
                alignment4 = alignment2;
                contentScale4 = contentScale2;
                f3 = f2;
                colorFilter4 = colorFilter2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 == 0) {
                        painter2 = subcomposeAsyncImage52.getPainter();
                        i3 &= -897;
                    } else {
                        painter2 = painter;
                    }
                    if ((i2 & 4) == 0) {
                        contentDescription = subcomposeAsyncImage52.getContentDescription();
                        i3 &= -7169;
                    } else {
                        contentDescription = str2;
                    }
                    if ((i2 & 8) == 0) {
                        alignment3 = subcomposeAsyncImage52.getAlignment();
                        i3 &= -57345;
                    } else {
                        alignment3 = alignment2;
                    }
                    if ((i2 & 16) == 0) {
                        contentScale3 = subcomposeAsyncImage52.getContentScale();
                        i3 &= -458753;
                    } else {
                        contentScale3 = contentScale2;
                    }
                    if ((i2 & 32) == 0) {
                        alpha = subcomposeAsyncImage52.getAlpha();
                        i3 &= -3670017;
                    } else {
                        alpha = f2;
                    }
                    if ((i2 & 64) == 0) {
                        colorFilter3 = subcomposeAsyncImage52.getColorFilter();
                        i3 &= -29360129;
                    } else {
                        colorFilter3 = colorFilter2;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -234881025;
                        clipToBounds = subcomposeAsyncImage52.getClipToBounds();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if (i4 != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -3670017;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -29360129;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -234881025;
                    }
                    painter2 = painter;
                    contentDescription = str2;
                    alignment3 = alignment2;
                    contentScale3 = contentScale2;
                    alpha = f2;
                    colorFilter3 = colorFilter2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(880638523, i3, -1, "coil.compose.SubcomposeAsyncImageContent (SubcomposeAsyncImage.kt:335)");
                }
                Modifier modifierContentDescription = UtilsKt.contentDescription(modifier2, contentDescription);
                if (clipToBounds) {
                    modifierContentDescription = Clip.clipToBounds(modifierContentDescription);
                }
                painter = painter2;
                Modifier modifierThen = modifierContentDescription.then(new ContentPainterElement(painter, alignment3, contentScale3, alpha, colorFilter3));
                C46212 c46212 = new MeasurePolicy() { // from class: coil.compose.SubcomposeAsyncImageKt.SubcomposeAsyncImageContent.2
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        return MeasureScope.layout$default(measureScope, Constraints.m7977getMinWidthimpl(j), Constraints.m7976getMinHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: coil.compose.SubcomposeAsyncImageKt.SubcomposeAsyncImageContent.2.1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(544976794);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                final Function0<ComposeUiNode> constructor = companion.getConstructor();
                composerStartRestartGroup.startReplaceableGroup(1405779621);
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(new Function0<ComposeUiNode>() { // from class: coil.compose.SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        public final ComposeUiNode invoke() {
                            return constructor.invoke();
                        }
                    });
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, c46212, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str3 = contentDescription;
                modifier3 = modifier2;
                alignment4 = alignment3;
                contentScale4 = contentScale3;
                f3 = alpha;
                colorFilter4 = colorFilter3;
            }
            final Painter painter3 = painter;
            final boolean z2 = clipToBounds;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: coil.compose.SubcomposeAsyncImageKt.SubcomposeAsyncImageContent.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i12) {
                        SubcomposeAsyncImage2.SubcomposeAsyncImageContent(subcomposeAsyncImage5, modifier3, painter3, str3, alignment4, contentScale4, f3, colorFilter4, z2, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((57344 & i) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        if ((3670016 & i) != 0) {
        }
        if ((29360128 & i) != 0) {
        }
        if ((234881024 & i) != 0) {
        }
        if (i4 != 2) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) != 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierContentDescription2 = UtilsKt.contentDescription(modifier2, contentDescription);
                if (clipToBounds) {
                }
                painter = painter2;
                Modifier modifierThen2 = modifierContentDescription2.then(new ContentPainterElement(painter, alignment3, contentScale3, alpha, colorFilter3));
                C46212 c462122 = new MeasurePolicy() { // from class: coil.compose.SubcomposeAsyncImageKt.SubcomposeAsyncImageContent.2
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        return MeasureScope.layout$default(measureScope, Constraints.m7977getMinWidthimpl(j), Constraints.m7976getMinHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: coil.compose.SubcomposeAsyncImageKt.SubcomposeAsyncImageContent.2.1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(544976794);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen2);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                final Function0 constructor2 = companion2.getConstructor();
                composerStartRestartGroup.startReplaceableGroup(1405779621);
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, c462122, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    str3 = contentDescription;
                    modifier3 = modifier2;
                    alignment4 = alignment3;
                    contentScale4 = contentScale3;
                    f3 = alpha;
                    colorFilter4 = colorFilter3;
                }
            }
        }
        final Painter painter32 = painter;
        final boolean z22 = clipToBounds;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
