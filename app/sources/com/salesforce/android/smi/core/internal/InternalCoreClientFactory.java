package com.salesforce.android.smi.core.internal;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.salesforce.android.smi.common.internal.util.SingletonHolder;
import com.salesforce.android.smi.core.Configuration;
import com.salesforce.android.smi.core.CoreClient;
import com.salesforce.android.smi.core.CoreClientFactory;
import com.salesforce.android.smi.core.CoreConfiguration;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalCoreClientFactory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0002B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/InternalCoreClientFactory;", "Lcom/salesforce/android/smi/core/CoreClientFactory;", "Lcom/salesforce/android/smi/common/internal/util/SingletonHolder;", "Lcom/salesforce/android/smi/core/CoreClient;", "Lkotlin/Pair;", "Landroid/content/Context;", "Lcom/salesforce/android/smi/core/Configuration;", "<init>", "()V", "context", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Landroid/content/Context;Lcom/salesforce/android/smi/core/Configuration;)Lcom/salesforce/android/smi/core/CoreClient;", "", "sdkVersion", "Ljava/lang/String;", "getSdkVersion", "()Ljava/lang/String;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class InternalCoreClientFactory extends SingletonHolder<CoreClient, Tuples2<? extends Context, ? extends Configuration>> implements CoreClientFactory {
    public static final InternalCoreClientFactory INSTANCE = new InternalCoreClientFactory();
    private static final String sdkVersion = "1.9.1";

    private InternalCoreClientFactory() {
        super(new Function1() { // from class: com.salesforce.android.smi.core.internal.InternalCoreClientFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalCoreClientFactory._init_$lambda$0((Tuples2) obj);
            }
        }, new Function1() { // from class: com.salesforce.android.smi.core.internal.InternalCoreClientFactory$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalCoreClientFactory._init_$lambda$1((CoreClient) obj);
            }
        }, new Function2() { // from class: com.salesforce.android.smi.core.internal.InternalCoreClientFactory$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(InternalCoreClientFactory._init_$lambda$2((Tuples2) obj, (Tuples2) obj2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoreClient _init_$lambda$0(Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return InternalCoreClient.INSTANCE.create((Context) it.getFirst(), (Configuration) it.getSecond());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(CoreClient it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.destroy();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(Tuples2 tuples2, Tuples2 newArg) {
        Configuration configuration;
        Intrinsics.checkNotNullParameter(newArg, "newArg");
        return !Intrinsics.areEqual((tuples2 == null || (configuration = (Configuration) tuples2.getSecond()) == null) ? null : new CoreConfiguration(configuration), new CoreConfiguration((Configuration) newArg.getSecond()));
    }

    @Override // com.salesforce.android.smi.core.CoreClientFactory
    public synchronized CoreClient create(Context context, Configuration configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return getIdempotentInstance(new Tuples2(context, configuration));
    }
}
