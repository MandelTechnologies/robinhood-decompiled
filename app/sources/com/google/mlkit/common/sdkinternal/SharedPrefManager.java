package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import java.util.UUID;

/* compiled from: com.google.mlkit:common@@18.11.0 */
/* loaded from: classes.dex */
public class SharedPrefManager {
    public static final Component<?> COMPONENT = Component.builder(SharedPrefManager.class).add(Dependency.required((Class<?>) MlKitContext.class)).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: com.google.mlkit.common.sdkinternal.zzs
        @Override // com.google.firebase.components.ComponentFactory
        public final Object create(ComponentContainer componentContainer) {
            return new SharedPrefManager((Context) componentContainer.get(Context.class));
        }
    }).build();
    protected final Context zza;

    public SharedPrefManager(Context context) {
        this.zza = context;
    }

    public synchronized String getMlSdkInstanceId() {
        String string2 = zza().getString("ml_sdk_instance_id", null);
        if (string2 != null) {
            return string2;
        }
        String string3 = UUID.randomUUID().toString();
        zza().edit().putString("ml_sdk_instance_id", string3).apply();
        return string3;
    }

    protected final SharedPreferences zza() {
        return this.zza.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
