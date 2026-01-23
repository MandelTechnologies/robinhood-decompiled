package com.google.maps.android.compose;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;

/* compiled from: RememberComposeBitmapDescriptor.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010²\u0006\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\nX\u008a\u0084\u0002"}, m3636d2 = {"", "", "keys", "Lkotlin/Function0;", "", "content", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "rememberComposeBitmapDescriptor", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lcom/google/android/gms/maps/model/BitmapDescriptor;", "Landroid/view/ViewGroup;", "parent", "Landroidx/compose/runtime/CompositionContext;", "compositionContext", "renderComposableToBitmapDescriptor", "(Landroid/view/ViewGroup;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Lcom/google/android/gms/maps/model/BitmapDescriptor;", "currentContent", "maps-compose_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.google.maps.android.compose.RememberComposeBitmapDescriptorKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class RememberComposeBitmapDescriptor {
    public static final BitmapDescriptor rememberComposeBitmapDescriptor(Object[] keys, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(1029749567);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1029749567, i, -1, "com.google.maps.android.compose.rememberComposeBitmapDescriptor (RememberComposeBitmapDescriptor.kt:22)");
        }
        Object objConsume = composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) objConsume;
        CompositionContext compositionContextRememberCompositionContext = Composables.rememberCompositionContext(composer, 0);
        SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composer, (i >> 3) & 14);
        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
        spreadBuilder.add(viewGroup);
        spreadBuilder.add(compositionContextRememberCompositionContext);
        spreadBuilder.add(rememberComposeBitmapDescriptor$lambda$0(snapshotState4RememberUpdatedState));
        spreadBuilder.addSpread(keys);
        Object[] array2 = spreadBuilder.toArray(new Object[spreadBuilder.size()]);
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (Object obj : array2) {
            zChanged |= composer.changed(obj);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = renderComposableToBitmapDescriptor(viewGroup, compositionContextRememberCompositionContext, rememberComposeBitmapDescriptor$lambda$0(snapshotState4RememberUpdatedState));
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        BitmapDescriptor bitmapDescriptor = (BitmapDescriptor) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bitmapDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BitmapDescriptor renderComposableToBitmapDescriptor(ViewGroup viewGroup, CompositionContext compositionContext, Function2<? super Composer, ? super Integer, Unit> function2) {
        Canvas canvas = new Canvas();
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setParentCompositionContext(compositionContext);
        composeView.setContent(function2);
        viewGroup.addView(composeView);
        composeView.draw(canvas);
        composeView.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), Integer.MIN_VALUE));
        composeView.layout(0, 0, composeView.getMeasuredWidth(), composeView.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(composeView.getMeasuredWidth(), composeView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        composeView.draw(new Canvas(bitmapCreateBitmap));
        viewGroup.removeView(composeView);
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(bitmapCreateBitmap);
        Intrinsics.checkNotNullExpressionValue(bitmapDescriptorFromBitmap, "fromBitmap(...)");
        return bitmapDescriptorFromBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<Composer, Integer, Unit> rememberComposeBitmapDescriptor$lambda$0(SnapshotState4<? extends Function2<? super Composer, ? super Integer, Unit>> snapshotState4) {
        return (Function2) snapshotState4.getValue();
    }
}
