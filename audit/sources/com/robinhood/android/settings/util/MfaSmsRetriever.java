package com.robinhood.android.settings.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.system.BroadcastReceivers2;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* compiled from: MfaSmsRetriever.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/settings/util/MfaSmsRetriever;", "", "<init>", "()V", "PATTERN", "Lkotlin/text/Regex;", "listenForMfaCode", "Lio/reactivex/Observable;", "", "context", "Landroid/content/Context;", "lib-mfa_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class MfaSmsRetriever {
    public static final MfaSmsRetriever INSTANCE = new MfaSmsRetriever();
    private static final Regex PATTERN = new Regex("\\d{6}+");

    private MfaSmsRetriever() {
    }

    public final Observable<String> listenForMfaCode(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SmsRetriever.getClient(context).startSmsRetriever();
        Observable<Intent> observableFilter = BroadcastReceivers2.broadcasts(context, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), 2).filter(new Predicate() { // from class: com.robinhood.android.settings.util.MfaSmsRetriever.listenForMfaCode.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                if (!Intrinsics.areEqual(intent.getAction(), "com.google.android.gms.auth.api.phone.SMS_RETRIEVED")) {
                    return false;
                }
                Parcelable parcelableExtra = intent.getParcelableExtra("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                Intrinsics.checkNotNull(parcelableExtra);
                return ((Status) parcelableExtra).getStatusCode() == 0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        Observable<R> map = observableFilter.map(new Function() { // from class: com.robinhood.android.settings.util.MfaSmsRetriever$listenForMfaCode$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                MatchResult matchResultFind$default;
                Intrinsics.checkNotNullParameter(it, "it");
                String stringExtra = ((Intent) it).getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                String value = null;
                if (stringExtra != null && (matchResultFind$default = Regex.find$default(MfaSmsRetriever.PATTERN, stringExtra, 0, 2, null)) != null) {
                    value = matchResultFind$default.getValue();
                }
                return Optional3.asOptional(value);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((MfaSmsRetriever$listenForMfaCode$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return ObservablesKt.filterIsPresent(map);
    }
}
