package coil.compose;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.IntSize2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import coil.request.NullRequestDataException;
import coil.size.Dimension;
import coil.size.Dimension2;
import coil.size.Scale;
import coil.size.Size;
import coil.size.SizeResolver;
import coil.size.SizeResolver2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: utils.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a_\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001c\u001a\u00020\u001a*\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u0005H\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u0018\u0010%\u001a\u0004\u0018\u00010\"*\u00020!H\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010*\u001a\u00020&*\u00020!2\u0006\u0010'\u001a\u00020&H\u0000ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u001e\u0010-\u001a\u00020&*\u00020!2\u0006\u0010+\u001a\u00020&H\u0000ø\u0001\u0000¢\u0006\u0004\b,\u0010)\u001a\u0016\u00102\u001a\u00020/*\u00020.H\u0000ø\u0001\u0000¢\u0006\u0004\b0\u00101\"\u001a\u00103\u001a\u00020!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u001a\u00108\u001a\u0002078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0018\u0010?\u001a\u00020<*\u00020.8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@"}, m3636d2 = {"", "model", "Lcoil/request/ImageRequest;", "requestOf", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Lcoil/request/ImageRequest;", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "requestOfWithSizeResolver", "(Ljava/lang/Object;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;I)Lcoil/request/ImageRequest;", "Landroidx/compose/ui/graphics/painter/Painter;", "placeholder", "error", "fallback", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "transformOf", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;)Lkotlin/jvm/functions/Function1;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "", "onLoading", "Lcoil/compose/AsyncImagePainter$State$Success;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Error;", "onError", "onStateOf", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/Modifier;", "", "contentDescription", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "Lcoil/size/Scale;", "toScale", "(Landroidx/compose/ui/layout/ContentScale;)Lcoil/size/Scale;", "Landroidx/compose/ui/unit/Constraints;", "Lcoil/size/Size;", "toSizeOrNull-BRTryo0", "(J)Lcoil/size/Size;", "toSizeOrNull", "", "width", "constrainWidth-K40F9xA", "(JF)F", "constrainWidth", "height", "constrainHeight-K40F9xA", "constrainHeight", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/IntSize;", "toIntSize-uvyYCjk", "(J)J", "toIntSize", "ZeroConstraints", "J", "getZeroConstraints", "()J", "Lcoil/size/SizeResolver;", "OriginalSizeResolver", "Lcoil/size/SizeResolver;", "getOriginalSizeResolver", "()Lcoil/size/SizeResolver;", "", "isPositive-uvyYCjk", "(J)Z", "isPositive", "coil-compose-base_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class UtilsKt {
    private static final long ZeroConstraints = Constraints.INSTANCE.m7984fixedJhjzzOo(0, 0);
    private static final SizeResolver OriginalSizeResolver = SizeResolver2.create(Size.ORIGINAL);

    public static final ImageRequest requestOf(Object obj, Composer composer, int i) {
        composer.startReplaceableGroup(1087186730);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1087186730, i, -1, "coil.compose.requestOf (utils.kt:31)");
        }
        if (obj instanceof ImageRequest) {
            ImageRequest imageRequest = (ImageRequest) obj;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return imageRequest;
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(375474364);
        boolean zChanged = composer.changed(context) | composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new ImageRequest.Builder(context).data(obj).build();
            composer.updateRememberedValue(objRememberedValue);
        }
        ImageRequest imageRequest2 = (ImageRequest) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageRequest2;
    }

    public static final ImageRequest requestOfWithSizeResolver(Object obj, ContentScale contentScale, Composer composer, int i) {
        SizeResolver sizeResolver;
        composer.startReplaceableGroup(1677680258);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1677680258, i, -1, "coil.compose.requestOfWithSizeResolver (utils.kt:50)");
        }
        boolean z = obj instanceof ImageRequest;
        if (z) {
            ImageRequest imageRequest = (ImageRequest) obj;
            if (imageRequest.getDefined().getSizeResolver() != null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return imageRequest;
            }
        }
        composer.startReplaceableGroup(-679565543);
        if (Intrinsics.areEqual(contentScale, ContentScale.INSTANCE.getNone())) {
            sizeResolver = OriginalSizeResolver;
        } else {
            composer.startReplaceableGroup(-679565452);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ConstraintsSizeResolver();
                composer.updateRememberedValue(objRememberedValue);
            }
            sizeResolver = (ConstraintsSizeResolver) objRememberedValue;
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        if (z) {
            composer.startReplaceableGroup(-679565365);
            composer.startReplaceableGroup(-679565358);
            boolean zChanged = composer.changed(obj) | composer.changed(sizeResolver);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = ImageRequest.newBuilder$default((ImageRequest) obj, null, 1, null).size(sizeResolver).build();
                composer.updateRememberedValue(objRememberedValue2);
            }
            ImageRequest imageRequest2 = (ImageRequest) objRememberedValue2;
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return imageRequest2;
        }
        composer.startReplaceableGroup(-679565199);
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(-679565153);
        boolean zChanged2 = composer.changed(context) | composer.changed(obj) | composer.changed(sizeResolver);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new ImageRequest.Builder(context).data(obj).size(sizeResolver).build();
            composer.updateRememberedValue(objRememberedValue3);
        }
        ImageRequest imageRequest3 = (ImageRequest) objRememberedValue3;
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageRequest3;
    }

    public static final Function1<AsyncImagePainter.State, AsyncImagePainter.State> transformOf(final Painter painter, final Painter painter2, final Painter painter3) {
        if (painter != null || painter2 != null || painter3 != null) {
            return new Function1<AsyncImagePainter.State, AsyncImagePainter.State>() { // from class: coil.compose.UtilsKt.transformOf.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final AsyncImagePainter.State invoke(AsyncImagePainter.State state) {
                    if (state instanceof AsyncImagePainter.State.Loading) {
                        Painter painter4 = painter;
                        AsyncImagePainter.State.Loading loading = (AsyncImagePainter.State.Loading) state;
                        return painter4 != null ? loading.copy(painter4) : loading;
                    }
                    if (!(state instanceof AsyncImagePainter.State.Error)) {
                        return state;
                    }
                    AsyncImagePainter.State.Error error = (AsyncImagePainter.State.Error) state;
                    if (error.getResult().getThrowable() instanceof NullRequestDataException) {
                        Painter painter5 = painter3;
                        return painter5 != null ? AsyncImagePainter.State.Error.copy$default(error, painter5, null, 2, null) : error;
                    }
                    Painter painter6 = painter2;
                    return painter6 != null ? AsyncImagePainter.State.Error.copy$default(error, painter6, null, 2, null) : error;
                }
            };
        }
        return AsyncImagePainter.INSTANCE.getDefaultTransform();
    }

    public static final Function1<AsyncImagePainter.State, Unit> onStateOf(final Function1<? super AsyncImagePainter.State.Loading, Unit> function1, final Function1<? super AsyncImagePainter.State.Success, Unit> function12, final Function1<? super AsyncImagePainter.State.Error, Unit> function13) {
        if (function1 == null && function12 == null && function13 == null) {
            return null;
        }
        return new Function1<AsyncImagePainter.State, Unit>() { // from class: coil.compose.UtilsKt.onStateOf.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AsyncImagePainter.State state) {
                invoke2(state);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AsyncImagePainter.State state) {
                Function1<AsyncImagePainter.State.Error, Unit> function14;
                if (state instanceof AsyncImagePainter.State.Loading) {
                    Function1<AsyncImagePainter.State.Loading, Unit> function15 = function1;
                    if (function15 != null) {
                        function15.invoke(state);
                        return;
                    }
                    return;
                }
                if (state instanceof AsyncImagePainter.State.Success) {
                    Function1<AsyncImagePainter.State.Success, Unit> function16 = function12;
                    if (function16 != null) {
                        function16.invoke(state);
                        return;
                    }
                    return;
                }
                if (!(state instanceof AsyncImagePainter.State.Error) || (function14 = function13) == null) {
                    return;
                }
                function14.invoke(state);
            }
        };
    }

    public static final Modifier contentDescription(Modifier modifier, final String str) {
        return str != null ? SemanticsModifier6.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: coil.compose.UtilsKt.contentDescription.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                SemanticsPropertiesKt.m7496setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m7483getImageo7Vup1c());
            }
        }, 1, null) : modifier;
    }

    public static final Scale toScale(ContentScale contentScale) {
        ContentScale.Companion companion = ContentScale.INSTANCE;
        return Intrinsics.areEqual(contentScale, companion.getFit()) ? true : Intrinsics.areEqual(contentScale, companion.getInside()) ? Scale.FIT : Scale.FILL;
    }

    /* renamed from: toSizeOrNull-BRTryo0, reason: not valid java name */
    public static final Size m9129toSizeOrNullBRTryo0(long j) {
        if (Constraints.m7979isZeroimpl(j)) {
            return null;
        }
        return new Size(Constraints.m7971getHasBoundedWidthimpl(j) ? Dimension2.Dimension(Constraints.m7975getMaxWidthimpl(j)) : Dimension.Undefined.INSTANCE, Constraints.m7970getHasBoundedHeightimpl(j) ? Dimension2.Dimension(Constraints.m7974getMaxHeightimpl(j)) : Dimension.Undefined.INSTANCE);
    }

    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final float m9126constrainWidthK40F9xA(long j, float f) {
        return RangesKt.coerceIn(f, Constraints.m7977getMinWidthimpl(j), Constraints.m7975getMaxWidthimpl(j));
    }

    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final float m9125constrainHeightK40F9xA(long j, float f) {
        return RangesKt.coerceIn(f, Constraints.m7976getMinHeightimpl(j), Constraints.m7974getMaxHeightimpl(j));
    }

    /* renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m9128toIntSizeuvyYCjk(long j) {
        return IntSize2.IntSize(MathKt.roundToInt(androidx.compose.p011ui.geometry.Size.m6583getWidthimpl(j)), MathKt.roundToInt(androidx.compose.p011ui.geometry.Size.m6580getHeightimpl(j)));
    }

    /* renamed from: isPositive-uvyYCjk, reason: not valid java name */
    public static final boolean m9127isPositiveuvyYCjk(long j) {
        return ((double) androidx.compose.p011ui.geometry.Size.m6583getWidthimpl(j)) >= 0.5d && ((double) androidx.compose.p011ui.geometry.Size.m6580getHeightimpl(j)) >= 0.5d;
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }
}
