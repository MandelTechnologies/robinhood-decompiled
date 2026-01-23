package io.sentry.config;

/* loaded from: classes14.dex */
final class SystemPropertyPropertiesProvider extends AbstractPropertiesProvider {
    public SystemPropertyPropertiesProvider() {
        super("sentry.", System.getProperties());
    }
}
