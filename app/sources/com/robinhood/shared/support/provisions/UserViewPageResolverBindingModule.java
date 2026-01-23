package com.robinhood.shared.support.provisions;

import com.robinhood.android.lib.pathfinder.UserViewPageResolver;
import com.robinhood.models.api.pathfinder.userview.UserViewPageType;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: UserViewPageResolverBindingModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/support/provisions/UserViewPageResolverBindingModule;", "", "userViewPageResolvers", "", "Lcom/robinhood/models/api/pathfinder/userview/UserViewPageType;", "Lcom/robinhood/android/lib/pathfinder/UserViewPageResolver;", "getUserViewPageResolvers", "()Ljava/util/Map;", "lib-support-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface UserViewPageResolverBindingModule {
    Map<UserViewPageType, UserViewPageResolver> getUserViewPageResolvers();
}
