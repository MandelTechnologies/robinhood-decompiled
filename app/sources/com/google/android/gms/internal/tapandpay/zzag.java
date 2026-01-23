package com.google.android.gms.internal.tapandpay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tapandpay.TapAndPay;
import com.google.android.gms.tapandpay.TapAndPayClient;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
public final class zzag extends GoogleApi implements TapAndPayClient {
    public zzag(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) TapAndPay.zza, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<List<TokenInfo>> listTokens() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzd) ((zzaj) obj).getService()).zzk(new zzad(this.zza, (TaskCompletionSource) obj2));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzw).setMethodKey(2163).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void pushTokenize(final Activity activity, final PushTokenizeRequest pushTokenizeRequest, final int i) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzd) ((zzaj) obj).getService()).zzl(pushTokenizeRequest, new zzai(activity, i));
            }
        }).setMethodKey(2106).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<Void> registerDataChangedListener(TapAndPay.DataChangedListener dataChangedListener) {
        final ListenerHolder listenerHolderRegisterListener = registerListener(dataChangedListener, "tapAndPayDataChangedListener");
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(listenerHolderRegisterListener).register(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zzd) ((zzaj) obj).getService()).zzm(new com.google.android.gms.tapandpay.zzd(null, listenerHolderRegisterListener));
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzw
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
            }
        }).setMethodKey(2155).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<PendingIntent> viewToken(final ViewTokenRequest viewTokenRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzag zzagVar = this.zza;
                ((zzd) ((zzaj) obj).getService()).zzr(viewTokenRequest, new zzaf(zzagVar, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(2160).setFeatures(com.google.android.gms.tapandpay.zza.zzj).build());
    }

    public zzag(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) TapAndPay.zza, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
