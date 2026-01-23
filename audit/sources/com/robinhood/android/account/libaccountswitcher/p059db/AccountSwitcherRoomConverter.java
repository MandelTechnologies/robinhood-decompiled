package com.robinhood.android.account.libaccountswitcher.p059db;

import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherAccount;
import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherLocation;
import com.robinhood.database.InjectedTypeConverter;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountSwitcherRoomConverter.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007J\u001a\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0007J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0007R'\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/account/libaccountswitcher/db/AccountSwitcherRoomConverters;", "Lcom/robinhood/database/InjectedTypeConverter;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;)V", "accountSwitcherAccountListJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccount;", "getAccountSwitcherAccountListJsonAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "accountSwitcherAccountListJsonAdapter$delegate", "Lkotlin/Lazy;", "accountSwitcherAccountListToString", "", "accountSwitcherAccountList", "stringToAccountSwitcherAccountList", "json", "convertAccountSwitcherLocationToServerValue", "enumValue", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherLocation;", "convertServerValueToAccountSwitcherLocation", "serverValue", "lib-account-switcher-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.account.libaccountswitcher.db.AccountSwitcherRoomConverters, reason: use source file name */
/* loaded from: classes17.dex */
public final class AccountSwitcherRoomConverter implements InjectedTypeConverter {

    /* renamed from: accountSwitcherAccountListJsonAdapter$delegate, reason: from kotlin metadata */
    private final Lazy accountSwitcherAccountListJsonAdapter;

    public AccountSwitcherRoomConverter(final LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.accountSwitcherAccountListJsonAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.account.libaccountswitcher.db.AccountSwitcherRoomConverters$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountSwitcherRoomConverter.accountSwitcherAccountListJsonAdapter_delegate$lambda$0(moshi);
            }
        });
    }

    private final JsonAdapter<List<AccountSwitcherAccount>> getAccountSwitcherAccountListJsonAdapter() {
        return (JsonAdapter) this.accountSwitcherAccountListJsonAdapter.getValue();
    }

    public final String accountSwitcherAccountListToString(List<AccountSwitcherAccount> accountSwitcherAccountList) {
        if (accountSwitcherAccountList != null) {
            return getAccountSwitcherAccountListJsonAdapter().toJson(accountSwitcherAccountList);
        }
        return null;
    }

    public final List<AccountSwitcherAccount> stringToAccountSwitcherAccountList(String json) {
        if (json != null) {
            return getAccountSwitcherAccountListJsonAdapter().fromJson(json);
        }
        return null;
    }

    public final String convertAccountSwitcherLocationToServerValue(AccountSwitcherLocation enumValue) {
        return AccountSwitcherLocation.INSTANCE.toServerValue(enumValue);
    }

    public final AccountSwitcherLocation convertServerValueToAccountSwitcherLocation(String serverValue) {
        return AccountSwitcherLocation.INSTANCE.fromServerValue(serverValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter accountSwitcherAccountListJsonAdapter_delegate$lambda$0(LazyMoshi lazyMoshi) {
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<List<? extends AccountSwitcherAccount>>() { // from class: com.robinhood.android.account.libaccountswitcher.db.AccountSwitcherRoomConverters$accountSwitcherAccountListJsonAdapter_delegate$lambda$0$$inlined$getAdapter$1
        }.getType());
    }
}
