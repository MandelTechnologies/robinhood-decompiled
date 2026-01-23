package com.robinhood.compose.bento.util;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: ToggleableInteractionSource.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000fH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/compose/bento/util/ToggleableInteractionSource;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "loading", "", "showRippleEffectOnClick", "<init>", "(ZZ)V", "getLoading", "()Z", "setLoading", "(Z)V", "getShowRippleEffectOnClick", "setShowRippleEffectOnClick", "interactions", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Landroidx/compose/foundation/interaction/Interaction;", "getInteractions", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "emit", "", "interaction", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryEmit", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ToggleableInteractionSource implements InteractionSource3 {
    public static final int $stable = 0;
    private final SharedFlow2<Interaction> interactions = SharedFlow4.MutableSharedFlow$default(0, 16, BufferOverflow.DROP_OLDEST, 1, null);
    private boolean loading;
    private boolean showRippleEffectOnClick;

    public ToggleableInteractionSource(boolean z, boolean z2) {
        this.loading = z;
        this.showRippleEffectOnClick = z2;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final void setLoading(boolean z) {
        this.loading = z;
    }

    public final boolean getShowRippleEffectOnClick() {
        return this.showRippleEffectOnClick;
    }

    public final void setShowRippleEffectOnClick(boolean z) {
        this.showRippleEffectOnClick = z;
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public SharedFlow2<Interaction> getInteractions() {
        return this.interactions;
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource3
    public Object emit(Interaction interaction, Continuation<? super Unit> continuation) {
        if (this.loading) {
            return Unit.INSTANCE;
        }
        if (this.showRippleEffectOnClick || !(interaction instanceof PressInteraction.Press)) {
            Object objEmit = getInteractions().emit(interaction, continuation);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource3
    public boolean tryEmit(Interaction interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        if (this.loading) {
            return true;
        }
        if (this.showRippleEffectOnClick) {
            return getInteractions().tryEmit(interaction);
        }
        if (interaction instanceof PressInteraction.Press) {
            return true;
        }
        return getInteractions().tryEmit(interaction);
    }
}
