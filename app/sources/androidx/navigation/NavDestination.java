package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import androidx.collection.SparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavDeepLinkRequest;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.navigation.DeepLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: NavDestination.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000e\b\u0016\u0018\u0000 `2\u00020\u0001:\u0002`aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006¢\u0006\u0004\b\u0004\u0010\bJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0017J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001a\u0010\u001eJ\u001b\u0010!\u001a\u00020 2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0010H\u0017¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020\u00142\b\b\u0001\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u001d\u00100\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u000e¢\u0006\u0004\b0\u00101J\u001b\u00103\u001a\u0004\u0018\u00010#2\b\u00102\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0002H\u0016¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020(H\u0016¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u00106R.\u0010@\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010<R$\u0010H\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\t0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020*0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\"\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR,\u0010W\u001a\u00020(2\b\b\u0001\u0010W\u001a\u00020(8G@FX\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010;\"\u0004\bZ\u0010[R.\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010<\u001a\u0004\b\\\u00106\"\u0004\b]\u0010\u0005R\u0014\u0010_\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u00106¨\u0006b"}, m3636d2 = {"Landroidx/navigation/NavDestination;", "", "", "navigatorName", "<init>", "(Ljava/lang/String;)V", "Landroidx/navigation/Navigator;", "navigator", "(Landroidx/navigation/Navigator;)V", "Landroidx/navigation/NavDeepLink;", DeepLink.INTENT_ARG_DEEP_LINK, "Landroid/net/Uri;", "uri", "", "Landroidx/navigation/NavArgument;", "arguments", "", "hasRequiredArguments", "(Landroidx/navigation/NavDeepLink;Landroid/net/Uri;Ljava/util/Map;)Z", "uriPattern", "", "addDeepLink", "navDeepLink", "(Landroidx/navigation/NavDeepLink;)V", PlaceTypes.ROUTE, "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "(Ljava/lang/String;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "Landroidx/navigation/NavDeepLinkRequest;", "navDeepLinkRequest", "(Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "previousDestination", "", "buildDeepLinkIds", "(Landroidx/navigation/NavDestination;)[I", "Landroid/os/Bundle;", "hasRoute", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "supportsActions", "()Z", "", "actionId", "Landroidx/navigation/NavAction;", "action", "putAction", "(ILandroidx/navigation/NavAction;)V", "argumentName", "argument", "addArgument", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "args", "addInDefaultArgs", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "getNavigatorName", "Landroidx/navigation/NavGraph;", "<set-?>", "parent", "Landroidx/navigation/NavGraph;", "getParent", "()Landroidx/navigation/NavGraph;", "setParent", "(Landroidx/navigation/NavGraph;)V", "idName", "", AnnotatedPrivateKey.LABEL, "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "", "deepLinks", "Ljava/util/List;", "Landroidx/collection/SparseArrayCompat;", "actions", "Landroidx/collection/SparseArrayCompat;", "", "_arguments", "Ljava/util/Map;", "id", "I", "getId", "setId", "(I)V", "getRoute", "setRoute", "getDisplayName", "displayName", "Companion", "DeepLinkMatch", "navigation-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class NavDestination {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, Class<?>> classes = new LinkedHashMap();
    private Map<String, NavArgument> _arguments;
    private final SparseArrayCompat<NavAction> actions;
    private final List<NavDeepLink> deepLinks;
    private int id;
    private String idName;
    private CharSequence label;
    private final String navigatorName;
    private NavGraph parent;
    private String route;

    public boolean supportsActions() {
        return true;
    }

    public NavDestination(String navigatorName) {
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.navigatorName = navigatorName;
        this.deepLinks = new ArrayList();
        this.actions = new SparseArrayCompat<>();
        this._arguments = new LinkedHashMap();
    }

    public final String getNavigatorName() {
        return this.navigatorName;
    }

    /* compiled from: NavDestination.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0011\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0000H\u0096\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Landroidx/navigation/NavDestination$DeepLinkMatch;", "", "destination", "Landroidx/navigation/NavDestination;", "matchingArgs", "Landroid/os/Bundle;", "isExactDeepLink", "", "matchingPathSegments", "", "hasMatchingAction", "mimeTypeMatchLevel", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;ZIZI)V", "getDestination", "()Landroidx/navigation/NavDestination;", "getMatchingArgs", "()Landroid/os/Bundle;", "compareTo", "other", "hasMatchingArgs", "arguments", "navigation-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DeepLinkMatch implements Comparable<DeepLinkMatch> {
        private final NavDestination destination;
        private final boolean hasMatchingAction;
        private final boolean isExactDeepLink;
        private final Bundle matchingArgs;
        private final int matchingPathSegments;
        private final int mimeTypeMatchLevel;

        public DeepLinkMatch(NavDestination destination, Bundle bundle, boolean z, int i, boolean z2, int i2) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.destination = destination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z;
            this.matchingPathSegments = i;
            this.hasMatchingAction = z2;
            this.mimeTypeMatchLevel = i2;
        }

        public final NavDestination getDestination() {
            return this.destination;
        }

        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }

        @Override // java.lang.Comparable
        public int compareTo(DeepLinkMatch other) {
            Intrinsics.checkNotNullParameter(other, "other");
            boolean z = this.isExactDeepLink;
            if (z && !other.isExactDeepLink) {
                return 1;
            }
            if (!z && other.isExactDeepLink) {
                return -1;
            }
            int i = this.matchingPathSegments - other.matchingPathSegments;
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            Bundle bundle = this.matchingArgs;
            if (bundle != null && other.matchingArgs == null) {
                return 1;
            }
            if (bundle == null && other.matchingArgs != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.matchingArgs;
                Intrinsics.checkNotNull(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z2 = this.hasMatchingAction;
            if (z2 && !other.hasMatchingAction) {
                return 1;
            }
            if (z2 || !other.hasMatchingAction) {
                return this.mimeTypeMatchLevel - other.mimeTypeMatchLevel;
            }
            return -1;
        }

        public final boolean hasMatchingArgs(Bundle arguments) {
            Bundle bundle;
            Object obj;
            if (arguments == null || (bundle = this.matchingArgs) == null) {
                return false;
            }
            Set<String> setKeySet = bundle.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "matchingArgs.keySet()");
            for (String key : setKeySet) {
                if (!arguments.containsKey(key)) {
                    return false;
                }
                NavArgument navArgument = (NavArgument) this.destination._arguments.get(key);
                Object obj2 = null;
                NavType<Object> type2 = navArgument != null ? navArgument.getType() : null;
                if (type2 != null) {
                    Bundle bundle2 = this.matchingArgs;
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    obj = type2.get(bundle2, key);
                } else {
                    obj = null;
                }
                if (type2 != null) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    obj2 = type2.get(arguments, key);
                }
                if (!Intrinsics.areEqual(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public final NavGraph getParent() {
        return this.parent;
    }

    public final void setParent(NavGraph navGraph) {
        this.parent = navGraph;
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavDestination(Navigator<? extends NavDestination> navigator) {
        this(NavigatorProvider.INSTANCE.getNameForNavigator$navigation_common_release(navigator.getClass()));
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
        this.idName = null;
    }

    public final String getRoute() {
        return this.route;
    }

    public final void setRoute(String str) {
        Object next;
        if (str == null) {
            setId(0);
        } else {
            if (StringsKt.isBlank(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strCreateRoute = INSTANCE.createRoute(str);
            setId(strCreateRoute.hashCode());
            addDeepLink(strCreateRoute);
        }
        List<NavDeepLink> list = this.deepLinks;
        List<NavDeepLink> list2 = list;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((NavDeepLink) next).getUriPattern(), INSTANCE.createRoute(this.route))) {
                    break;
                }
            }
        }
        TypeIntrinsics.asMutableCollection(list2).remove(next);
        this.route = str;
    }

    public String getDisplayName() {
        String str = this.idName;
        return str == null ? String.valueOf(this.id) : str;
    }

    public final void addDeepLink(String uriPattern) {
        Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
        addDeepLink(new NavDeepLink.Builder().setUriPattern(uriPattern).build());
    }

    public final void addDeepLink(final NavDeepLink navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        List<String> listMissingRequiredArguments = NavArgument2.missingRequiredArguments(this._arguments, new Function1<String, Boolean>() { // from class: androidx.navigation.NavDestination$addDeepLink$missingRequiredArguments$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return Boolean.valueOf(!navDeepLink.getArgumentsNames$navigation_common_release().contains(key));
            }
        });
        if (!listMissingRequiredArguments.isEmpty()) {
            throw new IllegalArgumentException(("Deep link " + navDeepLink.getUriPattern() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + listMissingRequiredArguments).toString());
        }
        this.deepLinks.add(navDeepLink);
    }

    public final DeepLinkMatch matchDeepLink(String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        NavDeepLinkRequest.Builder.Companion companion = NavDeepLinkRequest.Builder.INSTANCE;
        Uri uri = Uri.parse(INSTANCE.createRoute(route));
        Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(this)");
        NavDeepLinkRequest navDeepLinkRequestBuild = companion.fromUri(uri).build();
        if (this instanceof NavGraph) {
            return ((NavGraph) this).matchDeepLinkExcludingChildren(navDeepLinkRequestBuild);
        }
        return matchDeepLink(navDeepLinkRequestBuild);
    }

    public DeepLinkMatch matchDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.deepLinks.isEmpty()) {
            return null;
        }
        DeepLinkMatch deepLinkMatch = null;
        for (NavDeepLink navDeepLink : this.deepLinks) {
            Uri uri = navDeepLinkRequest.getUri();
            Bundle matchingArguments = uri != null ? navDeepLink.getMatchingArguments(uri, this._arguments) : null;
            int iCalculateMatchingPathSegments$navigation_common_release = navDeepLink.calculateMatchingPathSegments$navigation_common_release(uri);
            String action = navDeepLinkRequest.getAction();
            boolean z = action != null && Intrinsics.areEqual(action, navDeepLink.getAction());
            String mimeType = navDeepLinkRequest.getMimeType();
            int mimeTypeMatchRating = mimeType != null ? navDeepLink.getMimeTypeMatchRating(mimeType) : -1;
            if (matchingArguments == null) {
                if (z || mimeTypeMatchRating > -1) {
                    if (hasRequiredArguments(navDeepLink, uri, this._arguments)) {
                    }
                }
            }
            DeepLinkMatch deepLinkMatch2 = new DeepLinkMatch(this, matchingArguments, navDeepLink.getIsExactDeepLink(), iCalculateMatchingPathSegments$navigation_common_release, z, mimeTypeMatchRating);
            if (deepLinkMatch == null || deepLinkMatch2.compareTo(deepLinkMatch) > 0) {
                deepLinkMatch = deepLinkMatch2;
            }
        }
        return deepLinkMatch;
    }

    private final boolean hasRequiredArguments(NavDeepLink deepLink, Uri uri, Map<String, NavArgument> arguments) {
        final Bundle matchingPathAndQueryArgs$navigation_common_release = deepLink.getMatchingPathAndQueryArgs$navigation_common_release(uri, arguments);
        return NavArgument2.missingRequiredArguments(arguments, new Function1<String, Boolean>() { // from class: androidx.navigation.NavDestination$hasRequiredArguments$missingRequiredArguments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return Boolean.valueOf(!matchingPathAndQueryArgs$navigation_common_release.containsKey(key));
            }
        }).isEmpty();
    }

    public static /* synthetic */ int[] buildDeepLinkIds$default(NavDestination navDestination, NavDestination navDestination2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i & 1) != 0) {
            navDestination2 = null;
        }
        return navDestination.buildDeepLinkIds(navDestination2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    @JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] buildDeepLinkIds(NavDestination previousDestination) {
        ArrayDeque arrayDeque = new ArrayDeque();
        NavDestination navDestination = this;
        while (true) {
            Intrinsics.checkNotNull(navDestination);
            NavGraph navGraph = navDestination.parent;
            if ((previousDestination != null ? previousDestination.parent : null) != null) {
                NavGraph navGraph2 = previousDestination.parent;
                Intrinsics.checkNotNull(navGraph2);
                if (navGraph2.findNode(navDestination.id) == navDestination) {
                    arrayDeque.addFirst(navDestination);
                    break;
                }
                if (navGraph == null || navGraph.getStartDestId() != navDestination.id) {
                    arrayDeque.addFirst(navDestination);
                }
                if (Intrinsics.areEqual(navGraph, previousDestination) || navGraph == null) {
                    break;
                }
                navDestination = navGraph;
            }
        }
        List list = CollectionsKt.toList(arrayDeque);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((NavDestination) it.next()).id));
        }
        return CollectionsKt.toIntArray(arrayList);
    }

    public final boolean hasRoute(String route, Bundle arguments) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (Intrinsics.areEqual(this.route, route)) {
            return true;
        }
        DeepLinkMatch deepLinkMatchMatchDeepLink = matchDeepLink(route);
        if (Intrinsics.areEqual(this, deepLinkMatchMatchDeepLink != null ? deepLinkMatchMatchDeepLink.getDestination() : null)) {
            return deepLinkMatchMatchDeepLink.hasMatchingArgs(arguments);
        }
        return false;
    }

    public final void putAction(int actionId, NavAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (supportsActions()) {
            if (actionId == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.actions.put(actionId, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + actionId + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final void addArgument(String argumentName, NavArgument argument) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this._arguments.put(argumentName, argument);
    }

    public final Bundle addInDefaultArgs(Bundle args) {
        Map<String, NavArgument> map;
        if (args == null && ((map = this._arguments) == null || map.isEmpty())) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, NavArgument> entry : this._arguments.entrySet()) {
            entry.getValue().putDefaultValue(entry.getKey(), bundle);
        }
        if (args != null) {
            bundle.putAll(args);
            for (Map.Entry<String, NavArgument> entry2 : this._arguments.entrySet()) {
                String key = entry2.getKey();
                NavArgument value = entry2.getValue();
                if (!value.verify(key, bundle)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + key + "' in argument bundle. " + value.getType().getName() + " expected.").toString());
                }
            }
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.idName;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.id));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.route;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            sb.append(" route=");
            sb.append(this.route);
        }
        if (this.label != null) {
            sb.append(" label=");
            sb.append(this.label);
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "sb.toString()");
        return string2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[EDGE_INSN: B:31:0x00a0->B:32:0x00a1 BREAK  A[LOOP:1: B:23:0x0071->B:47:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object other) {
        boolean z;
        boolean z2;
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof NavDestination)) {
            NavDestination navDestination = (NavDestination) other;
            boolean zAreEqual = Intrinsics.areEqual(this.deepLinks, navDestination.deepLinks);
            if (this.actions.size() != navDestination.actions.size()) {
                z = false;
                if (this._arguments.size() == navDestination._arguments.size()) {
                }
            } else {
                Iterator it = SequencesKt.asSequence(SparseArray.keyIterator(this.actions)).iterator2();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!Intrinsics.areEqual(this.actions.get(iIntValue), navDestination.actions.get(iIntValue))) {
                        z = false;
                        break;
                    }
                }
                z = true;
                if (this._arguments.size() == navDestination._arguments.size()) {
                    z2 = false;
                    if (this.id != navDestination.id) {
                    }
                } else {
                    for (Map.Entry entry : MapsKt.asSequence(this._arguments)) {
                        if (!navDestination._arguments.containsKey(entry.getKey()) || !Intrinsics.areEqual(navDestination._arguments.get(entry.getKey()), entry.getValue())) {
                            z2 = false;
                            break;
                        }
                    }
                    z2 = true;
                    if (this.id != navDestination.id && Intrinsics.areEqual(this.route, navDestination.route) && zAreEqual && z && z2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i = this.id * 31;
        String str = this.route;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        for (NavDeepLink navDeepLink : this.deepLinks) {
            int i2 = iHashCode * 31;
            String uriPattern = navDeepLink.getUriPattern();
            int iHashCode2 = (i2 + (uriPattern != null ? uriPattern.hashCode() : 0)) * 31;
            String action = navDeepLink.getAction();
            int iHashCode3 = (iHashCode2 + (action != null ? action.hashCode() : 0)) * 31;
            String mimeType = navDeepLink.getMimeType();
            iHashCode = iHashCode3 + (mimeType != null ? mimeType.hashCode() : 0);
        }
        Iterator itValueIterator = SparseArray.valueIterator(this.actions);
        while (itValueIterator.hasNext()) {
            NavAction navAction = (NavAction) itValueIterator.next();
            int destinationId = ((iHashCode * 31) + navAction.getDestinationId()) * 31;
            NavOptions navOptions = navAction.getNavOptions();
            iHashCode = destinationId + (navOptions != null ? navOptions.hashCode() : 0);
            Bundle defaultArguments = navAction.getDefaultArguments();
            if (defaultArguments != null && (setKeySet = defaultArguments.keySet()) != null) {
                Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet()");
                for (String str2 : setKeySet) {
                    int i3 = iHashCode * 31;
                    Bundle defaultArguments2 = navAction.getDefaultArguments();
                    Intrinsics.checkNotNull(defaultArguments2);
                    Object obj = defaultArguments2.get(str2);
                    iHashCode = i3 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str3 : this._arguments.keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str3.hashCode()) * 31;
            NavArgument navArgument = this._arguments.get(str3);
            iHashCode = iHashCode4 + (navArgument != null ? navArgument.hashCode() : 0);
        }
        return iHashCode;
    }

    /* compiled from: NavDestination.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000f*\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Landroidx/navigation/NavDestination$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "id", "", "getDisplayName", "(Landroid/content/Context;I)Ljava/lang/String;", PlaceTypes.ROUTE, "createRoute", "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/navigation/NavDestination;", "Lkotlin/sequences/Sequence;", "getHierarchy", "(Landroidx/navigation/NavDestination;)Lkotlin/sequences/Sequence;", "getHierarchy$annotations", "(Landroidx/navigation/NavDestination;)V", "hierarchy", "", "Ljava/lang/Class;", "classes", "Ljava/util/Map;", "navigation-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final String getDisplayName(Context context, int id) throws Resources.NotFoundException {
            String strValueOf;
            Intrinsics.checkNotNullParameter(context, "context");
            if (id <= 16777215) {
                return String.valueOf(id);
            }
            try {
                strValueOf = context.getResources().getResourceName(id);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(id);
            }
            Intrinsics.checkNotNullExpressionValue(strValueOf, "try {\n                co….toString()\n            }");
            return strValueOf;
        }

        public final String createRoute(String route) {
            if (route == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + route;
        }

        public final Sequence<NavDestination> getHierarchy(NavDestination navDestination) {
            Intrinsics.checkNotNullParameter(navDestination, "<this>");
            return SequencesKt.generateSequence(navDestination, new Function1<NavDestination, NavDestination>() { // from class: androidx.navigation.NavDestination$Companion$hierarchy$1
                @Override // kotlin.jvm.functions.Function1
                public final NavDestination invoke(NavDestination it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getParent();
                }
            });
        }
    }
}
