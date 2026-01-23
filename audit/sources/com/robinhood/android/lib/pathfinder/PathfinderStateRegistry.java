package com.robinhood.android.lib.pathfinder;

import com.robinhood.android.lib.pathfinder.extensions.ReleaseVersions;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.robinhood.models.api.pathfinder.userview.UserViewPageType;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.logging.CrashReporter;
import dagger.Lazy;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderStateRegistry.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B3\b\u0007\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014J\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0002R \u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry;", "", "resolvers", "Ldagger/Lazy;", "", "Lcom/robinhood/models/api/pathfinder/userview/UserViewPageType;", "Lcom/robinhood/android/lib/pathfinder/UserViewPageResolver;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "<init>", "(Ldagger/Lazy;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/utils/ReleaseVersion;)V", "fragmentKeyForUserView", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry$UnrenderableReason;", "inquiryId", "Ljava/util/UUID;", "userView", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "getFragmentKeyFromRegistry", "page", "UnrenderableReason", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class PathfinderStateRegistry {
    public static final int $stable = 8;
    private final Navigator navigator;
    private final ReleaseVersion releaseVersion;
    private final Lazy<Map<UserViewPageType, UserViewPageResolver>> resolvers;

    public PathfinderStateRegistry(Lazy<Map<UserViewPageType, UserViewPageResolver>> resolvers, Navigator navigator, ReleaseVersion releaseVersion) {
        Intrinsics.checkNotNullParameter(resolvers, "resolvers");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        this.resolvers = resolvers;
        this.navigator = navigator;
        this.releaseVersion = releaseVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Either<FragmentKey, UnrenderableReason> fragmentKeyForUserView(UUID inquiryId, UserViewState.Page<?> userView) {
        Either.Left leftAsLeft;
        Either.Left leftAsLeft2;
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(userView, "userView");
        String android2 = userView.getRenderablePlatforms().getAndroid();
        try {
            if (Intrinsics.areEqual(android2, ApiRenderablePlatforms.VERSIONS_NONE)) {
                return Either2.asRight(UnrenderableReason.INCOMPATIBLE_VERSION);
            }
            if (Intrinsics.areEqual(android2, ApiRenderablePlatforms.VERSIONS_ALL)) {
                FragmentKey fragmentKeyFromRegistry = getFragmentKeyFromRegistry(inquiryId, userView);
                if (fragmentKeyFromRegistry == null || this.navigator.resolve(fragmentKeyFromRegistry.getClass()) == null) {
                    fragmentKeyFromRegistry = null;
                }
                return (fragmentKeyFromRegistry == null || (leftAsLeft2 = Either2.asLeft(fragmentKeyFromRegistry)) == null) ? Either2.asRight(UnrenderableReason.DOES_NOT_EXIST) : leftAsLeft2;
            }
            if (ReleaseVersions.compareVersionName(this.releaseVersion, android2) < 0) {
                return Either2.asRight(UnrenderableReason.INCOMPATIBLE_VERSION);
            }
            FragmentKey fragmentKeyFromRegistry2 = getFragmentKeyFromRegistry(inquiryId, userView);
            return (fragmentKeyFromRegistry2 == null || (leftAsLeft = Either2.asLeft(fragmentKeyFromRegistry2)) == null) ? Either2.asRight(UnrenderableReason.DOES_NOT_EXIST) : leftAsLeft;
        } catch (NumberFormatException e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
            return Either2.asRight(UnrenderableReason.INCOMPATIBLE_VERSION);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PathfinderStateRegistry.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry$UnrenderableReason;", "", "<init>", "(Ljava/lang/String;I)V", "DOES_NOT_EXIST", "INCOMPATIBLE_VERSION", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UnrenderableReason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UnrenderableReason[] $VALUES;
        public static final UnrenderableReason DOES_NOT_EXIST = new UnrenderableReason("DOES_NOT_EXIST", 0);
        public static final UnrenderableReason INCOMPATIBLE_VERSION = new UnrenderableReason("INCOMPATIBLE_VERSION", 1);

        private static final /* synthetic */ UnrenderableReason[] $values() {
            return new UnrenderableReason[]{DOES_NOT_EXIST, INCOMPATIBLE_VERSION};
        }

        public static EnumEntries<UnrenderableReason> getEntries() {
            return $ENTRIES;
        }

        private UnrenderableReason(String str, int i) {
        }

        static {
            UnrenderableReason[] unrenderableReasonArr$values = $values();
            $VALUES = unrenderableReasonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(unrenderableReasonArr$values);
        }

        public static UnrenderableReason valueOf(String str) {
            return (UnrenderableReason) Enum.valueOf(UnrenderableReason.class, str);
        }

        public static UnrenderableReason[] values() {
            return (UnrenderableReason[]) $VALUES.clone();
        }
    }

    private final FragmentKey getFragmentKeyFromRegistry(UUID inquiryId, UserViewState.Page<?> page) {
        UserViewPageResolver userViewPageResolver = this.resolvers.get().get(page.getTypeContext().getPage());
        if (userViewPageResolver != null) {
            return userViewPageResolver.resolve(inquiryId, page);
        }
        return null;
    }
}
