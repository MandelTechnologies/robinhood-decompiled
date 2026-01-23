package com.robinhood.rhc.upsells;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: RhcUpsellsDataProviderService.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH§@¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH§@¢\u0006\u0002\u0010\fJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH§@¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\nH§@¢\u0006\u0002\u0010\fJ\u0016\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001aH§@¢\u0006\u0002\u0010\u001b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;", "", "formatMoney", "", "currencyCode", "amount", "minimumFractionDigits", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCryptoOrders", "", "Lcom/robinhood/rhc/upsells/CryptoOrder;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSeenUpsells", "Lcom/robinhood/rhc/upsells/SeenUpsell;", "hasSeenRewardConfirmation", "", "rewardId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markRewardConfirmationSeen", "", "markUpsellAsSeen", "seenUpsell", "(Lcom/robinhood/rhc/upsells/SeenUpsell;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markUpsellSeenAtTouchPointThisSession", "touchPoint", "Lcom/robinhood/rhc/upsells/TouchPoint;", "(Lcom/robinhood/rhc/upsells/TouchPoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rewardsSeen", "upsellsSeenAtTouchPointThisSession", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@ManagedServices(serviceName = "RhcUpsellsDataProviderService")
/* loaded from: classes26.dex */
public interface RhcUpsellsDataProviderService {
    Object formatMoney(String str, String str2, Integer num, Continuation<? super String> continuation);

    Object getCryptoOrders(Continuation<? super List<CryptoOrder>> continuation);

    Object getSeenUpsells(Continuation<? super List<SeenUpsell>> continuation);

    Object hasSeenRewardConfirmation(String str, Continuation<? super Boolean> continuation);

    Object markRewardConfirmationSeen(String str, Continuation<? super Unit> continuation);

    Object markUpsellAsSeen(SeenUpsell seenUpsell, Continuation<? super Unit> continuation);

    Object markUpsellSeenAtTouchPointThisSession(TouchPoint touchPoint, Continuation<? super Unit> continuation);

    Object rewardsSeen(Continuation<? super List<String>> continuation);

    Object upsellsSeenAtTouchPointThisSession(TouchPoint touchPoint, Continuation<? super Integer> continuation);

    /* compiled from: RhcUpsellsDataProviderService.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object formatMoney$default(RhcUpsellsDataProviderService rhcUpsellsDataProviderService, String str, String str2, Integer num, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatMoney");
            }
            if ((i & 4) != 0) {
                num = null;
            }
            return rhcUpsellsDataProviderService.formatMoney(str, str2, num, continuation);
        }
    }
}
