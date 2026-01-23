package com.robinhood.scarlet.registry;

import android.content.res.Resources;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.robinhood.scarlet.AffectedAttributes;
import com.robinhood.scarlet.transition.StylePropertyTransition;
import com.robinhood.scarlet.transition.ThemeTransition;
import com.robinhood.scarlet.transition.ThemeTransitionSet;
import com.robinhood.scarlet.transition.attribute.DefaultAttributeTransitions;
import com.robinhood.utils.extensions.Maps2;
import com.singular.sdk.internal.SLRemoteConfiguration;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;

/* compiled from: AttributeTransitionsRegistry.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB=\b\u0002\u00122\u0010\u0002\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u0003\u0018\u00010\u00060\u00030\u0003j\u0002`\u0007¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00060\u00032\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002J,\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00060\u00032\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0002J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00130\u000e\"\b\b\u0000\u0010\u0013*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0004H\u0002J0\u0010\u0014\u001a\f\u0012\u0004\u0012\u0002H\u0013\u0012\u0002\b\u00030\u0006\"\b\b\u0000\u0010\u0013*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00042\u0006\u0010\u0015\u001a\u00020\u0005J0\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00130\u000e\"\b\b\u0000\u0010\u0013*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00130\u000e\"\b\b\u0000\u0010\u0013*\u00020\u00012\u0006\u0010\u0019\u001a\u0002H\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u001aR:\u0010\u0002\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u0003\u0018\u00010\u00060\u00030\u0003j\u0002`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R8\u0010\n\u001a,\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00060\u00030\u000bj\u0002`\fX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/scarlet/registry/AttributeTransitionsRegistry;", "", "sourceMapping", "", "Ljava/lang/Class;", "", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "Lcom/robinhood/scarlet/registry/Mapping;", "<init>", "(Ljava/util/Map;)V", "resolvedMapping", "", "Lcom/robinhood/scarlet/registry/MutableMapping;", "transitionSets", "Lcom/robinhood/scarlet/transition/ThemeTransitionSet;", "collect", "type", SLRemoteConfiguration.Constants.RESOLVE_JSON_KEY, "resolveSet", "T", "getAttributeTransition", "name", "getAttributeTransitionSet", "affectedAttributes", "Lcom/robinhood/scarlet/AffectedAttributes;", "view", "(Ljava/lang/Object;Lcom/robinhood/scarlet/AffectedAttributes;)Lcom/robinhood/scarlet/transition/ThemeTransitionSet;", "Builder", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class AttributeTransitionsRegistry {
    public static final int $stable = 8;
    private final Map<Class<?>, Map<String, StylePropertyTransition<Object, ?>>> resolvedMapping;
    private final Map<Class<?>, Map<String, StylePropertyTransition<Object, ?>>> sourceMapping;
    private final Map<Class<?>, ThemeTransitionSet<?>> transitionSets;

    public /* synthetic */ AttributeTransitionsRegistry(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AttributeTransitionsRegistry(Map<Class<?>, ? extends Map<String, ? extends StylePropertyTransition<Object, ?>>> map) {
        this.sourceMapping = map;
        this.resolvedMapping = new LinkedHashMap();
        this.transitionSets = new LinkedHashMap();
    }

    private final Map<String, StylePropertyTransition<Object, ?>> collect(Class<?> type2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<? super Object> superclass = type2.getSuperclass();
        if (superclass != null) {
            linkedHashMap.putAll(resolve(superclass));
        }
        Class<?>[] interfaces = type2.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
        for (Class<?> cls : interfaces) {
            linkedHashMap.putAll(resolve(cls));
        }
        Map<String, StylePropertyTransition<Object, ?>> map = this.sourceMapping.get(type2);
        if (map != null) {
            Maps2.update(linkedHashMap, map);
        }
        return linkedHashMap;
    }

    private final Map<String, StylePropertyTransition<Object, ?>> resolve(Class<?> type2) {
        if (type2 == null) {
            return MapsKt.emptyMap();
        }
        Map<Class<?>, Map<String, StylePropertyTransition<Object, ?>>> map = this.resolvedMapping;
        Map<String, StylePropertyTransition<Object, ?>> mapCollect = map.get(type2);
        if (mapCollect == null) {
            mapCollect = collect(type2);
            map.put(type2, mapCollect);
        }
        return mapCollect;
    }

    private final <T> ThemeTransitionSet<T> resolveSet(Class<T> type2) {
        Map<Class<?>, ThemeTransitionSet<?>> map = this.transitionSets;
        ThemeTransition themeTransition = map.get(type2);
        if (themeTransition == null) {
            ThemeTransitionSet<?> themeTransitionSet = new ThemeTransitionSet<>(type2, SequencesKt.asIterable(SequencesKt.filter(CollectionsKt.asSequence(resolve(type2).values()), new Function1() { // from class: com.robinhood.scarlet.registry.AttributeTransitionsRegistry$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(AttributeTransitionsRegistry.resolveSet$lambda$4$lambda$3((StylePropertyTransition) obj));
                }
            })), null, 4, null);
            map.put(type2, themeTransitionSet);
            themeTransition = themeTransitionSet;
        }
        return (ThemeTransitionSet) themeTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean resolveSet$lambda$4$lambda$3(StylePropertyTransition it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !it.getIsOptIn();
    }

    public final <T> StylePropertyTransition<T, ?> getAttributeTransition(Class<T> type2, String name) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Map<String, StylePropertyTransition<Object, ?>> mapResolve = resolve(type2);
        StylePropertyTransition<T, ?> stylePropertyTransition = (StylePropertyTransition) mapResolve.get(name);
        if (stylePropertyTransition != null) {
            return stylePropertyTransition;
        }
        throw new NoSuchElementException("No transition for attribute '" + name + "'; available: " + mapResolve.keySet());
    }

    public static /* synthetic */ ThemeTransitionSet getAttributeTransitionSet$default(AttributeTransitionsRegistry attributeTransitionsRegistry, Class cls, AffectedAttributes affectedAttributes, int i, Object obj) {
        if ((i & 2) != 0) {
            affectedAttributes = null;
        }
        return attributeTransitionsRegistry.getAttributeTransitionSet(cls, affectedAttributes);
    }

    public final <T> ThemeTransitionSet<T> getAttributeTransitionSet(final Class<T> type2, final AffectedAttributes affectedAttributes) {
        Intrinsics.checkNotNullParameter(type2, "type");
        if (affectedAttributes == null) {
            return resolveSet(type2);
        }
        if (affectedAttributes instanceof AffectedAttributes.NameSet) {
            AffectedAttributes.NameSet nameSet = (AffectedAttributes.NameSet) affectedAttributes;
            if (nameSet instanceof AffectedAttributes.NameSet.Allowlist) {
                return new ThemeTransitionSet<>(type2, SequencesKt.asIterable(SequencesKt.map(CollectionsKt.asSequence(((AffectedAttributes.NameSet.Allowlist) affectedAttributes).getAttributeNames()), new Function1() { // from class: com.robinhood.scarlet.registry.AttributeTransitionsRegistry$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AttributeTransitionsRegistry.getAttributeTransitionSet$lambda$5(this.f$0, type2, (String) obj);
                    }
                })), null, 4, null);
            }
            if (!(nameSet instanceof AffectedAttributes.NameSet.Blocklist)) {
                throw new NoWhenBranchMatchedException();
            }
            return new ThemeTransitionSet<>(type2, SequencesKt.asIterable(SequencesKt.filter(CollectionsKt.asSequence(resolve(type2).values()), new Function1() { // from class: com.robinhood.scarlet.registry.AttributeTransitionsRegistry$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(AttributeTransitionsRegistry.getAttributeTransitionSet$lambda$6(affectedAttributes, (StylePropertyTransition) obj));
                }
            })), null, 4, null);
        }
        if (!(affectedAttributes instanceof AffectedAttributes.Everything)) {
            throw new NoWhenBranchMatchedException();
        }
        return new ThemeTransitionSet<>(type2, resolve(type2).values(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StylePropertyTransition getAttributeTransitionSet$lambda$5(AttributeTransitionsRegistry attributeTransitionsRegistry, Class cls, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return attributeTransitionsRegistry.getAttributeTransition(cls, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getAttributeTransitionSet$lambda$6(AffectedAttributes affectedAttributes, StylePropertyTransition transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        return (transition.getIsOptIn() || ((AffectedAttributes.NameSet.Blocklist) affectedAttributes).getAttributeNames().contains(transition.getStyleProperty().getName())) ? false : true;
    }

    public final <T> ThemeTransitionSet<T> getAttributeTransitionSet(T view, AffectedAttributes affectedAttributes) {
        Intrinsics.checkNotNullParameter(view, "view");
        Class<?> cls = view.getClass();
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of com.robinhood.scarlet.registry.AttributeTransitionsRegistry.getAttributeTransitionSet>");
        return getAttributeTransitionSet((Class) cls, affectedAttributes);
    }

    /* compiled from: AttributeTransitionsRegistry.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\f\u001a\u00020\u00002\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\nJ/\u0010\f\u001a\u00020\u00002\"\u0010\u000e\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n0\u000f\"\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n¢\u0006\u0002\u0010\u0010J\u001c\u0010\f\u001a\u00020\u00002\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n0\u0011J\u001c\u0010\u0012\u001a\u00020\u00002\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\b2\b\b\u0001\u0010\u0014\u001a\u00020\u0015J\u001f\u0010\u0012\u001a\u00020\u0000\"\n\b\u0000\u0010\u0016\u0018\u0001*\u00020\u00012\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0086\bJ\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R:\u0010\u0006\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u0003\u0018\u00010\n0\u00070\u0007j\u0002`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/scarlet/registry/AttributeTransitionsRegistry$Builder;", "", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "mapping", "", "Ljava/lang/Class;", "", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "Lcom/robinhood/scarlet/registry/BuilderMapping;", "add", NavTransition2.KEY_TRANSITION, "transitions", "", "([Lcom/robinhood/scarlet/transition/StylePropertyTransition;)Lcom/robinhood/scarlet/registry/AttributeTransitionsRegistry$Builder;", "", "markUnsupported", "type", "resId", "", "T", "build", "Lcom/robinhood/scarlet/registry/AttributeTransitionsRegistry;", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Builder {
        private final Map<Class<?>, Map<String, StylePropertyTransition<Object, ?>>> mapping;
        private final Resources resources;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public Builder(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            this.resources = resources;
            this.mapping = new LinkedHashMap();
        }

        public final Builder add(StylePropertyTransition<?, ?> transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            String name = transition.getStyleProperty().getName();
            Class<? super Object> receiverType = transition.getReceiverType();
            Map<Class<?>, Map<String, StylePropertyTransition<Object, ?>>> map = this.mapping;
            Map<String, StylePropertyTransition<Object, ?>> linkedHashMap = map.get(receiverType);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
                map.put(receiverType, linkedHashMap);
            }
            linkedHashMap.put(name, transition);
            return this;
        }

        public final Builder add(StylePropertyTransition<?, ?>... transitions) {
            Intrinsics.checkNotNullParameter(transitions, "transitions");
            for (StylePropertyTransition<?, ?> stylePropertyTransition : transitions) {
                add(stylePropertyTransition);
            }
            return this;
        }

        public final Builder add(Collection<? extends StylePropertyTransition<?, ?>> transitions) {
            Intrinsics.checkNotNullParameter(transitions, "transitions");
            Iterator<? extends StylePropertyTransition<?, ?>> it = transitions.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }

        public final Builder markUnsupported(Class<?> type2, int resId) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Map<Class<?>, Map<String, StylePropertyTransition<Object, ?>>> map = this.mapping;
            Map<String, StylePropertyTransition<Object, ?>> linkedHashMap = map.get(type2);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
                map.put(type2, linkedHashMap);
            }
            linkedHashMap.put(this.resources.getResourceEntryName(resId), null);
            return this;
        }

        public final /* synthetic */ <T> Builder markUnsupported(int resId) {
            Intrinsics.reifiedOperationMarker(4, "T");
            return markUnsupported(Object.class, resId);
        }

        public final AttributeTransitionsRegistry build() {
            return new AttributeTransitionsRegistry(MapsKt.toMutableMap(this.mapping), null);
        }

        /* compiled from: AttributeTransitionsRegistry.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/scarlet/registry/AttributeTransitionsRegistry$Builder$Companion;", "", "<init>", "()V", "withDefaults", "Lcom/robinhood/scarlet/registry/AttributeTransitionsRegistry$Builder;", "resources", "Landroid/content/res/Resources;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Builder withDefaults(Resources resources) {
                Intrinsics.checkNotNullParameter(resources, "resources");
                Builder builder = new Builder(resources);
                DefaultAttributeTransitions defaultAttributeTransitions = new DefaultAttributeTransitions(resources);
                builder.add(defaultAttributeTransitions.getView().getAlpha());
                builder.add(defaultAttributeTransitions.getView().getBackground());
                builder.add(defaultAttributeTransitions.getView().getBackgroundTint());
                builder.add(defaultAttributeTransitions.getView().getForeground());
                builder.add(defaultAttributeTransitions.getView().getForegroundTint());
                builder.add(defaultAttributeTransitions.getView().getPaddingLeft());
                builder.add(defaultAttributeTransitions.getView().getPaddingTop());
                builder.add(defaultAttributeTransitions.getView().getPaddingRight());
                builder.add(defaultAttributeTransitions.getView().getPaddingBottom());
                builder.add(defaultAttributeTransitions.getView().getPaddingStart());
                builder.add(defaultAttributeTransitions.getView().getPaddingEnd());
                builder.add(defaultAttributeTransitions.getAppCompatImageView().getSrcCompat());
                builder.add(defaultAttributeTransitions.getCompoundButton().getButtonTint());
                builder.add(defaultAttributeTransitions.getSpinner().getPopupBackground());
                builder.add(defaultAttributeTransitions.getProgressBar().getIndeterminateTint());
                builder.add(defaultAttributeTransitions.getProgressBar().getProgressTint());
                builder.add(defaultAttributeTransitions.getProgressBar().getProgressBackgroundTint());
                builder.add(defaultAttributeTransitions.getProgressBar().getProgressDrawable());
                builder.add(defaultAttributeTransitions.getTextView().getTextAppearance());
                builder.add(defaultAttributeTransitions.getTextView().getTextColorHighlight());
                builder.add(defaultAttributeTransitions.getTextView().getTextColorHint());
                builder.add(defaultAttributeTransitions.getTextView().getTextColorLink());
                builder.add(defaultAttributeTransitions.getTextView().getDrawableTint());
                builder.add(defaultAttributeTransitions.getImageView().getTint());
                builder.add(defaultAttributeTransitions.getImageView().getSrc());
                builder.add(defaultAttributeTransitions.getToolbar().getPopupTheme());
                builder.add(defaultAttributeTransitions.getToolbar().getTitleTextAppearance());
                builder.add(defaultAttributeTransitions.getToolbar().getSubtitleTextAppearance());
                builder.add(defaultAttributeTransitions.getToolbar().getColorControlNormal());
                return builder;
            }
        }
    }
}
