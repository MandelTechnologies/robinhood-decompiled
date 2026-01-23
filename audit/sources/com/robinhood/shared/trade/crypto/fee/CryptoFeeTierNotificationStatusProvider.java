package com.robinhood.shared.trade.crypto.fee;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import androidx.core.content.ContextCompat;
import com.robinhood.librobinhood.data.store.NotificationSettingStore;
import com.robinhood.models.api.ApiNotificationSettingsItem;
import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.LongPreference;
import com.robinhood.shared.trade.crypto.dagger.FeeTierNotificationPrimerLastTimeSeenMillisPref;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope2;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: CryptoFeeTierNotificationStatusProvider.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\u0086@¢\u0006\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0018\u0010\u001b\u001a\u00020\f*\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u00020\f*\u00020\u001d8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;", "", "Landroid/app/Application;", "application", "Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;", "notificationSettingStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/LongPreference;", "notifPrimerLastTimeSeenMillisPref", "<init>", "(Landroid/app/Application;Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;Lj$/time/Clock;Lcom/robinhood/prefs/LongPreference;)V", "", "hasSeenNotificationPrimerInLast7Days", "()Z", "Lkotlin/Result;", "canSkipNotificationPrompt-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canSkipNotificationPrompt", "", "optIn-IoAF18A", "optIn", "Landroid/app/Application;", "Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;", "Lj$/time/Clock;", "Lcom/robinhood/prefs/LongPreference;", "Lcom/robinhood/models/api/ApiNotificationSettingsItem;", "isEnabled", "(Lcom/robinhood/models/api/ApiNotificationSettingsItem;)Z", "Landroid/content/Context;", "isNotificationPermissionGranted", "(Landroid/content/Context;)Z", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoFeeTierNotificationStatusProvider {
    public static final String EMAIL_ITEM_ID = "email-account-crypto_fee_tier_status";
    public static final String EMAIL_SETTINGS_ID = "email";
    public static final String PUSH_ITEM_ID = "push-account-crypto_fee_tier_status";
    public static final String PUSH_SETTINGS_ID = "push";
    private final Application application;
    private final Clock clock;
    private final LongPreference notifPrimerLastTimeSeenMillisPref;
    private final NotificationSettingStore notificationSettingStore;
    public static final int $stable = 8;

    public CryptoFeeTierNotificationStatusProvider(Application application, NotificationSettingStore notificationSettingStore, Clock clock, @FeeTierNotificationPrimerLastTimeSeenMillisPref LongPreference notifPrimerLastTimeSeenMillisPref) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(notificationSettingStore, "notificationSettingStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(notifPrimerLastTimeSeenMillisPref, "notifPrimerLastTimeSeenMillisPref");
        this.application = application;
        this.notificationSettingStore = notificationSettingStore;
        this.clock = clock;
        this.notifPrimerLastTimeSeenMillisPref = notifPrimerLastTimeSeenMillisPref;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: canSkipNotificationPrompt-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m25807canSkipNotificationPromptIoAF18A(Continuation<? super Result<Boolean>> continuation) {
        CryptoFeeTierNotificationStatusProvider2 cryptoFeeTierNotificationStatusProvider2;
        if (continuation instanceof CryptoFeeTierNotificationStatusProvider2) {
            cryptoFeeTierNotificationStatusProvider2 = (CryptoFeeTierNotificationStatusProvider2) continuation;
            int i = cryptoFeeTierNotificationStatusProvider2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cryptoFeeTierNotificationStatusProvider2.label = i - Integer.MIN_VALUE;
            } else {
                cryptoFeeTierNotificationStatusProvider2 = new CryptoFeeTierNotificationStatusProvider2(this, continuation);
            }
        }
        Object objCoroutineScope = cryptoFeeTierNotificationStatusProvider2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cryptoFeeTierNotificationStatusProvider2.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCoroutineScope);
                Result.Companion companion = Result.INSTANCE;
                CryptoFeeTierNotificationStatusProvider3 cryptoFeeTierNotificationStatusProvider3 = new CryptoFeeTierNotificationStatusProvider3(this, null);
                cryptoFeeTierNotificationStatusProvider2.label = 1;
                objCoroutineScope = CoroutineScope2.coroutineScope(cryptoFeeTierNotificationStatusProvider3, cryptoFeeTierNotificationStatusProvider2);
                if (objCoroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCoroutineScope);
            }
            return ((Result) objCoroutineScope).getValue();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: optIn-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m25808optInIoAF18A(Continuation<? super Result<Unit>> continuation) {
        CryptoFeeTierNotificationStatusProvider6 cryptoFeeTierNotificationStatusProvider6;
        if (continuation instanceof CryptoFeeTierNotificationStatusProvider6) {
            cryptoFeeTierNotificationStatusProvider6 = (CryptoFeeTierNotificationStatusProvider6) continuation;
            int i = cryptoFeeTierNotificationStatusProvider6.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cryptoFeeTierNotificationStatusProvider6.label = i - Integer.MIN_VALUE;
            } else {
                cryptoFeeTierNotificationStatusProvider6 = new CryptoFeeTierNotificationStatusProvider6(this, continuation);
            }
        }
        Object objCoroutineScope = cryptoFeeTierNotificationStatusProvider6.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cryptoFeeTierNotificationStatusProvider6.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCoroutineScope);
                Result.Companion companion = Result.INSTANCE;
                CryptoFeeTierNotificationStatusProvider7 cryptoFeeTierNotificationStatusProvider7 = new CryptoFeeTierNotificationStatusProvider7(this, null);
                cryptoFeeTierNotificationStatusProvider6.label = 1;
                objCoroutineScope = CoroutineScope2.coroutineScope(cryptoFeeTierNotificationStatusProvider7, cryptoFeeTierNotificationStatusProvider6);
                if (objCoroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCoroutineScope);
            }
            return ((Result) objCoroutineScope).getValue();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasSeenNotificationPrimerInLast7Days() {
        Long orNull = this.notifPrimerLastTimeSeenMillisPref.getOrNull();
        return orNull != null && this.clock.millis() - orNull.longValue() < Duration.ofDays(7L).toMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isEnabled(ApiNotificationSettingsItem apiNotificationSettingsItem) {
        ApiNotificationSettingsToggleSettingsItem data;
        ApiNotificationSettingsToggleSettingsItem.Status status = null;
        ApiNotificationSettingsItem.ToggleSettingsItem toggleSettingsItem = apiNotificationSettingsItem instanceof ApiNotificationSettingsItem.ToggleSettingsItem ? (ApiNotificationSettingsItem.ToggleSettingsItem) apiNotificationSettingsItem : null;
        if (toggleSettingsItem != null && (data = toggleSettingsItem.getData()) != null) {
            status = data.getStatus();
        }
        return status == ApiNotificationSettingsToggleSettingsItem.Status.f5427ON;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"InlinedApi"})
    public final boolean isNotificationPermissionGranted(Context context) {
        return ContextCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0;
    }
}
