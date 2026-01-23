package com.robinhood.shared.accountactivityexporter;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.accountactivityexporter.api.ApiAccountActivityExporter;
import com.robinhood.models.accountactivityexporter.api.ApiAccountActivityExporterItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountActivityExporterDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterDataState;", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterViewState;", "<init>", "()V", "reduce", "dataState", "Companion", "feature-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.accountactivityexporter.AccountActivityExporterStateProvider, reason: use source file name */
/* loaded from: classes26.dex */
public final class AccountActivityExporterDuxo3 implements StateProvider<AccountActivityExporterDataState, AccountActivityExporterViewState> {
    public static final int $stable = 0;
    public static final int LONG_TERM_SURVEY_THRESHOLD = 5;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccountActivityExporterViewState reduce(AccountActivityExporterDataState dataState) {
        int i;
        List<ApiAccountActivityExporterItem> items;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ApiAccountActivityExporter response = dataState.getResponse();
        ApiAccountActivityExporter response2 = dataState.getResponse();
        if (response2 == null || (items = response2.getItems()) == null) {
            i = 0;
        } else {
            List<ApiAccountActivityExporterItem> list = items;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((ApiAccountActivityExporterItem) it.next()).getState().getIsTerminal() && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
        }
        return new AccountActivityExporterViewState(response, i >= 5);
    }
}
