package com.robinhood.android.common.gold;

import com.robinhood.android.common.gold.GoldPostUpgradeCelebrationFragment;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GoldPostUpgradeCelebrationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.gold.GoldPostUpgradeCelebrationFragment$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class GoldPostUpgradeCelebrationFragment2 extends FunctionReferenceImpl implements Function1<GenericAction, Unit> {
    GoldPostUpgradeCelebrationFragment2(Object obj) {
        super(1, obj, GoldPostUpgradeCelebrationFragment.Callbacks.class, "onGoldUpgradeCelebrationAction", "onGoldUpgradeCelebrationAction(Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GenericAction genericAction) {
        invoke2(genericAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GenericAction genericAction) {
        ((GoldPostUpgradeCelebrationFragment.Callbacks) this.receiver).onGoldUpgradeCelebrationAction(genericAction);
    }
}
