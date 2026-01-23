package com.robinhood.android.options.contracts;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: OptionsDetailPageLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/HasInitialPositionId;", "", "initialPositionId", "Ljava/util/UUID;", "getInitialPositionId", "()Ljava/util/UUID;", "positionIds", "", "getPositionIds", "()Ljava/util/List;", "Lcom/robinhood/android/options/contracts/OptionsDetailPageLaunchMode$AggregatePositionId;", "Lcom/robinhood/android/options/contracts/OptionsDetailPageLaunchMode$OptionPositionId;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.contracts.HasInitialPositionId, reason: use source file name */
/* loaded from: classes11.dex */
public interface OptionsDetailPageLaunchMode2 {
    UUID getInitialPositionId();

    List<UUID> getPositionIds();
}
