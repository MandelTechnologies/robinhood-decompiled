package com.robinhood.hammer.android.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import androidx.fragment.app.Fragment;
import com.robinhood.hammer.core.internal.InternalHammerApi;
import dagger.MembersInjector;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: InjectorsStubModule.kt */
@InternalHammerApi
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001R(\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR(\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u00050\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR(\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\u00050\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/hammer/android/internal/InjectorsStubModule;", "", "activityInjectors", "", "", "Ldagger/MembersInjector;", "Landroid/app/Activity;", "getActivityInjectors", "()Ljava/util/Map;", "fragmentInjectors", "Landroidx/fragment/app/Fragment;", "getFragmentInjectors", "broadcastReceiverInjectors", "Landroid/content/BroadcastReceiver;", "getBroadcastReceiverInjectors", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface InjectorsStubModule {
    Map<String, MembersInjector<? extends Activity>> getActivityInjectors();

    Map<String, MembersInjector<? extends BroadcastReceiver>> getBroadcastReceiverInjectors();

    Map<String, MembersInjector<? extends Fragment>> getFragmentInjectors();
}
