package com.robinhood.android.lib.pathfinder;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.singular.sdk.internal.SLRemoteConfiguration;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: UserViewPageResolver.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/UserViewPageResolver;", "", SLRemoteConfiguration.Constants.RESOLVE_JSON_KEY, "Lcom/robinhood/android/navigation/keys/FragmentKey;", "inquiryId", "Ljava/util/UUID;", "page", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface UserViewPageResolver {
    FragmentKey resolve(UUID inquiryId, UserViewState.Page<?> page);
}
