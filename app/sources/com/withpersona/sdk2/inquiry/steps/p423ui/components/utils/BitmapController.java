package com.withpersona.sdk2.inquiry.steps.p423ui.components.utils;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: BitmapController.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR(\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/BitmapController;", "", "initialValue", "Landroid/graphics/Bitmap;", "<init>", "(Landroid/graphics/Bitmap;)V", "_bitmapValue", "Lkotlinx/coroutines/flow/MutableStateFlow;", "onChanged", "Lkotlinx/coroutines/flow/Flow;", "getOnChanged", "()Lkotlinx/coroutines/flow/Flow;", "value", "getValue", "()Landroid/graphics/Bitmap;", "setValue", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class BitmapController {
    private final StateFlow2<Bitmap> _bitmapValue;
    private final Flow<Bitmap> onChanged;

    public BitmapController(Bitmap bitmap) {
        StateFlow2<Bitmap> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(bitmap);
        this._bitmapValue = stateFlow2MutableStateFlow;
        this.onChanged = FlowKt.drop(stateFlow2MutableStateFlow, 1);
    }

    public final Flow<Bitmap> getOnChanged() {
        return this.onChanged;
    }

    public final Bitmap getValue() {
        return this._bitmapValue.getValue();
    }

    public final void setValue(Bitmap bitmap) {
        this._bitmapValue.setValue(bitmap);
    }
}
