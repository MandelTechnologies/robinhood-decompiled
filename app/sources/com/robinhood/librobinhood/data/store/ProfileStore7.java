package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.bonfire.ApiSocialProfileInfo;
import com.robinhood.models.api.bonfire.ApiSocialProfileInfo2;
import com.robinhood.models.p320db.MediaMetadata;
import com.robinhood.models.p320db.Profile;
import com.robinhood.models.p320db.Profile2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: ProfileStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"toDbModel", "Lcom/robinhood/models/db/Profile;", "Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;", "lib-store-profile_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.ProfileStoreKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class ProfileStore7 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Profile toDbModel(ApiSocialProfileInfo apiSocialProfileInfo) {
        ApiSocialProfileInfo2 private_profile_info = apiSocialProfileInfo.getPrivate_profile_info();
        Intrinsics.checkNotNull(private_profile_info);
        String username = private_profile_info.getUsername();
        LocalDate join_date = private_profile_info.getJoin_date();
        Profile2 profile2FromServerValue = Profile2.INSTANCE.fromServerValue(private_profile_info.getProfile_color());
        if (profile2FromServerValue == null) {
            profile2FromServerValue = Profile2.UNKNOWN;
        }
        Profile2 profile2 = profile2FromServerValue;
        String profile_picture = private_profile_info.getProfile_picture();
        return new Profile("0", username, join_date, profile2, profile_picture != null ? new MediaMetadata(new UUID(0L, 0L), profile_picture) : null);
    }
}
