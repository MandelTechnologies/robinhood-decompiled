package com.robinhood.android.lists.p173ui.userlist;

import com.robinhood.rosetta.eventlogging.Asset;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListUserListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$itemTouchHelperCallbacks$2$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class CuratedListUserListFragment6 extends FunctionReferenceImpl implements Function2<UUID, Asset.AssetType, Unit> {
    CuratedListUserListFragment6(Object obj) {
        super(2, obj, CuratedListUserListFragment.class, "synchronizeListDeleteItem", "synchronizeListDeleteItem(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid, Asset.AssetType assetType) {
        invoke2(uuid, assetType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UUID p0, Asset.AssetType p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((CuratedListUserListFragment) this.receiver).synchronizeListDeleteItem(p0, p1);
    }
}
