# simple-clj-api

FIXME: description

## Docker build

docker build ./simple-clj-api \
             -f ./simple-clj-api/Dockerfile \
             -t simple-clj-api:latest


## Docker run

docker run -p 80:80 \
           -e PORT="80" \
           -it simple-clj-api:latest


## Docker publish
https://blog.codecentric.de/github-container-registry

docker login ghcr.io -u cljcloud

Enter personal access token with packages read/write/delete permissions

docker tag simple-clj-api:latest ghcr.io/cljcloud/simple-clj-api:latest

docker push ghcr.io/cljcloud/simple-clj-api:latest


## Installation

Download from http://example.com/FIXME.

## Usage

FIXME: explanation

    $ java -jar simple-clj-api-0.1.0-standalone.jar [args]

## Options

FIXME: listing of options this app accepts.

## Examples

...

### Bugs

...

### Any Other Sections
### That You Think
### Might be Useful

## License

Copyright © 2022 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
