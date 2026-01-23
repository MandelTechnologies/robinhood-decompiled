package com.salesforce.android.smi.core;

import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.core.internal.InternalCoreClient;
import com.salesforce.android.smi.core.internal.InternalCoreClientFactory;
import com.salesforce.android.smi.network.api.auth.UserVerificationProvider;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CoreClient.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\u0006\u0010\u0013\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH&¢\u0006\u0004\b\u0017\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/salesforce/android/smi/core/CoreClient;", "", "Ljava/util/UUID;", "conversationId", "Lcom/salesforce/android/smi/core/ConversationClient;", "conversationClient", "(Ljava/util/UUID;)Lcom/salesforce/android/smi/core/ConversationClient;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "start", "(Lkotlinx/coroutines/CoroutineScope;)V", "stop", "()V", "Lcom/salesforce/android/smi/network/api/auth/UserVerificationProvider;", "provider", "registerUserVerificationProvider", "(Lcom/salesforce/android/smi/network/api/auth/UserVerificationProvider;)V", "", "deregisterDevice", "Lcom/salesforce/android/smi/common/api/Result;", "revokeToken", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "destroy", "Companion", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface CoreClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    ConversationClient conversationClient(UUID conversationId);

    void destroy();

    void registerUserVerificationProvider(UserVerificationProvider provider);

    Object revokeToken(boolean z, Continuation<? super Result<Unit>> continuation);

    void start(CoroutineScope scope);

    void stop();

    /* compiled from: CoreClient.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/salesforce/android/smi/core/CoreClient$Companion;", "", "<init>", "()V", "Lcom/salesforce/android/smi/core/CoreClientFactory;", "Factory", "Lcom/salesforce/android/smi/core/CoreClientFactory;", "getFactory", "()Lcom/salesforce/android/smi/core/CoreClientFactory;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final CoreClientFactory Factory = InternalCoreClientFactory.INSTANCE;
        private final /* synthetic */ InternalCoreClient.Companion $$delegate_0 = InternalCoreClient.INSTANCE;

        private Companion() {
        }

        public final CoreClientFactory getFactory() {
            return Factory;
        }
    }
}
