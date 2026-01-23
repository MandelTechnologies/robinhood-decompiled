package com.robinhood.android.microgramsdui.control;

import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.moshi.LazyMoshi2;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.p507ui.p508v1.HtmlCanvasScreenContentDto;

/* compiled from: IdlUiController.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
/* synthetic */ class IdlUiController$htmlCanvasScreenAdapter$2 extends FunctionReferenceImpl implements Function0<JsonAdapter<HtmlCanvasScreenContentDto>> {
    IdlUiController$htmlCanvasScreenAdapter$2(Object obj) {
        super(0, obj, LazyMoshi2.class, "getAdapter", "getAdapter(Lcom/robinhood/utils/moshi/LazyMoshi;)Lcom/squareup/moshi/JsonAdapter;", 1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final JsonAdapter<HtmlCanvasScreenContentDto> invoke() {
        LazyMoshi lazyMoshi = (LazyMoshi) this.receiver;
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<HtmlCanvasScreenContentDto>() { // from class: com.robinhood.android.microgramsdui.control.IdlUiController$htmlCanvasScreenAdapter$2$invoke$$inlined$getAdapter$1
        }.getType());
    }
}
