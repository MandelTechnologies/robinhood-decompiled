package com.robinhood.shared.support.supportchat.p396ui;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope9;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatMessageComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$AgentMessage$2$3$1, reason: use source file name */
/* loaded from: classes6.dex */
final class ChatMessageComposable4 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ Integer $avatarResource;
    final /* synthetic */ ConstraintLayoutBaseScope4 $bubble;

    ChatMessageComposable4(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, Integer num) {
        this.$bubble = constraintLayoutBaseScope4;
        this.$avatarResource = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        ConstraintLayoutBaseScope9 invisible;
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), this.$bubble.getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        if (this.$avatarResource != null) {
            invisible = ConstraintLayoutBaseScope9.INSTANCE.getVisible();
        } else {
            invisible = ConstraintLayoutBaseScope9.INSTANCE.getInvisible();
        }
        constrainAs.setVisibility(invisible);
    }
}
