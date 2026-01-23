package com.robinhood.android.options.tradability.fixtures;

import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.models.p355ui.UiOptionChain;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: CreateOptionChainExpirationDateState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"j$/time/LocalDate", "expirationDate", "Lcom/robinhood/models/ui/UiOptionChain;", "uiOptionChain", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "createOptionChainExpirationDateState", "(Lj$/time/LocalDate;Lcom/robinhood/models/ui/UiOptionChain;)Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "lib-options-tradability_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.tradability.fixtures.CreateOptionChainExpirationDateStateKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class CreateOptionChainExpirationDateState {
    public static final OptionChainExpirationDateState createOptionChainExpirationDateState(LocalDate expirationDate, UiOptionChain uiOptionChain) {
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        return new OptionChainExpirationDateState(expirationDate, uiOptionChain);
    }
}
