package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class CreateTransferFragment$onStart$11$1$1 implements SduiActionHandler, FunctionAdapter {
    final /* synthetic */ CreateTransferFragment $tmp0;

    CreateTransferFragment$onStart$11$1$1(CreateTransferFragment createTransferFragment) {
        this.$tmp0 = createTransferFragment;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof SduiActionHandler) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, CreateTransferFragment.class, "handle", "handle(Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;)Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
    public final boolean mo15941handle(GenericAction p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.$tmp0.mo15941handle(p0);
    }
}
