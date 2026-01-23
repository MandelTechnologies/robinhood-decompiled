# Structure

This document is a deeper map of the repository contents.

## Top-level

- `app/`
  - Purpose: single canonical \"full fidelity\" decompile output.
  - Shape: `app/sources/` (Java) + `app/resources/` (Android res, manifest, META-INF, etc.).
  - Notable: may contain native libs under `app/resources/lib/*.so`.

- `audit/`
  - Purpose: audit-oriented bundle for review and analysis.
  - Notable folders:
    - `audit/reports/`: generated summaries (package list, URL hosts, manifest components, file index)
    - `audit/protos/`: collected protobuf definitions
    - `audit/manifest/`: AndroidManifest.xml extracted for quick review
    - `audit/meta/`: META-INF artifacts
    - `audit/sources/` + `audit/resources/`: curated subset of code/resources

## Entry points for common tasks

- Search code:
  - `app/sources/`
- Find Android manifest:
  - `app/resources/AndroidManifest.xml`
  - `audit/manifest/AndroidManifest.xml`
- Skim permissions/components quickly:
  - `audit/reports/manifest_components.txt`
- Identify major feature areas (packages):
  - `audit/reports/top_packages.txt`
- Find network endpoints / hosts:
  - `audit/reports/url_hosts.txt`
